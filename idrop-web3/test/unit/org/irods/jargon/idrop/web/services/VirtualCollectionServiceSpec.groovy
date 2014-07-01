package org.irods.jargon.idrop.web.services

import grails.test.mixin.*

import org.codehaus.groovy.grails.plugins.testing.GrailsMockHttpSession
import org.irods.jargon.core.connection.IRODSAccount
import org.irods.jargon.core.pub.IRODSAccessObjectFactory
import org.irods.jargon.core.query.PagingAwareCollectionListing
import org.irods.jargon.idrop.web.services.VirtualCollectionService.ListingType
import org.irods.jargon.vircoll.AbstractVirtualCollection
import org.irods.jargon.vircoll.impl.VirtualCollectionDiscoveryServiceImpl
import org.irods.jargon.vircoll.impl.VirtualCollectionExecutorFactoryImpl
import org.irods.jargon.vircoll.types.CollectionBasedVirtualCollection
import org.irods.jargon.vircoll.types.CollectionBasedVirtualCollectionExecutor
import org.irods.jargon.idrop.web.services.VirtualCollectionService


import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(VirtualCollectionService)
class VirtualCollectionServiceSpec  extends Specification  {

	void "test get vc cached in session"() {
		given:
		IRODSAccount irodsAccount = IRODSAccount.instance("host", 1247, "user", "password", "", "zone", "")
		String uniqueName = "hithere"
		def irodsAccessObjectFactory = mockFor(IRODSAccessObjectFactory)
		irodsAccessObjectFactory.demand.getEnvironmentalInfoAO{ irodsAcct -> return envMock }
		def iafMock = irodsAccessObjectFactory.createMock()
		PagingAwareCollectionListing listing = new PagingAwareCollectionListing()

		def collectionBasedVirtualCollectionExecutor = mockFor(CollectionBasedVirtualCollectionExecutor)
		collectionBasedVirtualCollectionExecutor.demand.queryAll{return listing}
		def execMock = collectionBasedVirtualCollectionExecutor.createMock()

		def virtualCollectionExecutorFactory = mockFor(VirtualCollectionExecutorFactoryImpl)
		virtualCollectionExecutorFactory.demand.instanceExecutorBasedOnVirtualCollection{vc -> return execMock}
		def factMock = virtualCollectionExecutorFactory.createMock()

		def virtualCollectionFactoryCreatorService = mockFor(VirtualCollectionFactoryCreatorService)
		virtualCollectionFactoryCreatorService.demand.instanceVirtualCollectionExecutorFactory{irodsAcct -> return factMock}

		def virtualCollectionExecutorFactoryCreatorServiceMock = virtualCollectionFactoryCreatorService.createMock()

		def mockSession = new GrailsMockHttpSession()
		List<AbstractVirtualCollection> virColls = new ArrayList<AbstractVirtualCollection>()
		CollectionBasedVirtualCollection collBasedVirColl = new CollectionBasedVirtualCollection(uniqueName,"/a/path")
		virColls.add(collBasedVirColl)
		mockSession.virtualCollections = virColls

		VirtualCollectionService virtualCollectionService = new VirtualCollectionService()
		virtualCollectionService.irodsAccessObjectFactory = iafMock
		virtualCollectionService.virtualCollectionFactoryCreatorService = virtualCollectionExecutorFactoryCreatorServiceMock

		when:

		def actual = virtualCollectionService.virtualCollectionDetails(uniqueName,irodsAccount, mockSession)

		then:

		actual != null
	}

	void "test get vc not cached in session but retrieved via listing"() {
		given:
		IRODSAccount irodsAccount = IRODSAccount.instance("host", 1247, "user", "password", "", "zone", "")
		String uniqueName = "root"
		def irodsAccessObjectFactory = mockFor(IRODSAccessObjectFactory)
		irodsAccessObjectFactory.demand.getEnvironmentalInfoAO{ irodsAcct -> return envMock }
		def iafMock = irodsAccessObjectFactory.createMock()
		PagingAwareCollectionListing listing = new PagingAwareCollectionListing()

		def collectionBasedVirtualCollectionExecutor = mockFor(CollectionBasedVirtualCollectionExecutor)
		collectionBasedVirtualCollectionExecutor.demand.queryAll{return listing}
		def execMock = collectionBasedVirtualCollectionExecutor.createMock()


		def virtualCollectionExecutorFactory = mockFor(VirtualCollectionExecutorFactoryImpl)
		virtualCollectionExecutorFactory.demand.instanceExecutorBasedOnVirtualCollection{vc -> return execMock}
		def factMock = virtualCollectionExecutorFactory.createMock()

		def virtualCollectionFactoryCreatorService = mockFor(VirtualCollectionFactoryCreatorService)
		virtualCollectionFactoryCreatorService.demand.instanceVirtualCollectionExecutorFactory{irodsAcct -> return factMock}


		List<AbstractVirtualCollection> virColls = new ArrayList<AbstractVirtualCollection>()
		CollectionBasedVirtualCollection collBasedVirColl = new CollectionBasedVirtualCollection(uniqueName,"/a/path")
		virColls.add(collBasedVirColl)
		def virtualCollectionDiscoveryService = mockFor(VirtualCollectionDiscoveryServiceImpl)
		virtualCollectionDiscoveryService.demand.listDefaultUserCollections{return virColls}
		def discoveryMock = virtualCollectionDiscoveryService.createMock()

		virtualCollectionFactoryCreatorService.demand.instanceVirtualCollectionDiscoveryService{irodsAcct -> return discoveryMock}

		def virtualCollectionExecutorFactoryCreatorServiceMock = virtualCollectionFactoryCreatorService.createMock()

		def mockSession = new GrailsMockHttpSession()

		mockSession.virtualCollections = []

		VirtualCollectionService virtualCollectionService = new VirtualCollectionService()
		virtualCollectionService.irodsAccessObjectFactory = iafMock
		virtualCollectionService.virtualCollectionFactoryCreatorService = virtualCollectionExecutorFactoryCreatorServiceMock

		when:

		def actual = virtualCollectionService.virtualCollectionDetails(uniqueName,irodsAccount, mockSession)

		then:

		actual != null
	}

	void "test create listing from collection based vc"() {
		given:
		IRODSAccount irodsAccount = IRODSAccount.instance("host", 1247, "user", "password", "", "zone", "")
		String uniqueName = "root"
		def irodsAccessObjectFactory = mockFor(IRODSAccessObjectFactory)
		irodsAccessObjectFactory.demand.getEnvironmentalInfoAO{ irodsAcct -> return envMock }
		def iafMock = irodsAccessObjectFactory.createMock()
		PagingAwareCollectionListing listing = new PagingAwareCollectionListing()

		List<AbstractVirtualCollection> virColls = new ArrayList<AbstractVirtualCollection>()
		CollectionBasedVirtualCollection collBasedVirColl = new CollectionBasedVirtualCollection(uniqueName,"/a/path")
		virColls.add(collBasedVirColl)

		def virtualCollectionFactoryCreatorService = mockFor(VirtualCollectionFactoryCreatorService)
		def collectionBasedVirtualCollectionExecutor = mockFor(CollectionBasedVirtualCollectionExecutor)
		collectionBasedVirtualCollectionExecutor.demand.queryAll{return listing}
		def execMock = collectionBasedVirtualCollectionExecutor.createMock()
		def virtualCollectionExecutorFactory = mockFor(VirtualCollectionExecutorFactoryImpl)
		virtualCollectionExecutorFactory.demand.instanceExecutorBasedOnVirtualCollection{vc -> return execMock}

		def factMock = virtualCollectionExecutorFactory.createMock()

		def virtualCollectionDiscoveryService = mockFor(VirtualCollectionDiscoveryServiceImpl)
		virtualCollectionDiscoveryService.demand.listDefaultUserCollections{return virColls}
		def discoveryMock = virtualCollectionDiscoveryService.createMock()


		//virtualCollectionFactoryCreatorService.demand.instanceVirtualCollectionDiscoveryService{irodsAcct -> return discoveryMock}
		virtualCollectionFactoryCreatorService.demand.instanceVirtualCollectionExecutorFactory{irodsAcct -> return factMock}

		def mockSession = new GrailsMockHttpSession()

		mockSession.virtualCollections = virColls

		VirtualCollectionService virtualCollectionService = new VirtualCollectionService()
		virtualCollectionService.irodsAccessObjectFactory = iafMock
		def virtualCollectionFactoryCreatorServiceMock = virtualCollectionFactoryCreatorService.createMock()

		virtualCollectionService.virtualCollectionFactoryCreatorService = virtualCollectionFactoryCreatorServiceMock

		when:

		def actual = virtualCollectionService.virtualCollectionListing(uniqueName, "/a/path", ListingType.ALL, 0, irodsAccount, mockSession)

		then:

		actual != null
	}
}