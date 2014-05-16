package org.irods.jargon.idrop.web.controllers

import grails.converters.JSON
import grails.rest.RestfulController

import org.irods.jargon.core.pub.IRODSAccessObjectFactory
import org.irods.jargon.idrop.web.services.IrodsCollectionService
import org.irods.jargon.idrop.web.services.VirtualCollectionService
import org.irods.jargon.idrop.web.services.VirtualCollectionService.ListingType

/**
 * Controller for dealing with collection listings of various sorts
 * 
 * @author Mike Conway - DICE
 */  

class CollectionController extends RestfulController {

	static responseFormats = ['json']
	IRODSAccessObjectFactory irodsAccessObjectFactory
	IrodsCollectionService irodsCollectionService
	VirtualCollectionService virtualCollectionService

	/**
	 * Obtain a listing of collection contents
	 * 
	 * note that the path is overloaded to have a virtual collection name, then a collection path (url encoded) and then parameters to tune the listing/paging behavior
	 * 
	 * TODO: listing type and path with paging semantics
	 * 
	 * @return
	 */
	def show() {
		log.info("show")
		def irodsAccount = request.irodsAccount
		if (!irodsAccount) throw new IllegalStateException("no irodsAccount in request")

		def path = params.path
		if (!path) path = ""

		int offset = params.offset
		if (!offset) offset = 0

		def virtualCollection = params.virtualCollection

		if (!virtualCollection) {
			throw new IllegalArgumentException("no virtualCollection provided")
		}

		//offset = (int) offset

		log.info("path:${path}")
		log.info("offset:${offset}")
		log.info("virtualCollection:${virtualCollection}")

		def pagingAwareCollectionListing = virtualCollectionService.virtualCollectionListing(virtualCollection, path, ListingType.ALL, (int) offset, irodsAccount, session)
		log.info("pagingAwareCollectionListing:${pagingAwareCollectionListing}")
		render pagingAwareCollectionListing as JSON
	}

	def index() {
		log.info("index()")
	}
}
