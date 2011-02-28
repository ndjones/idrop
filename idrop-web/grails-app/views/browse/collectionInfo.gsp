<fieldset id="verticalForm"><label for="">Parent
Collection:</label> <g:textField name="collectionParentName"
	value="${collection.collectionParentName}" readonly="true" /> <br />

<label for="collectionName">Collection Name:</label> <g:textField
	name="collectionName" value="${collection.collectionName}"
	readonly="true" /> <br />

<label for="createdAt">Created At:</label> <g:textField name="createdAt"
	value="${collection.createdAt}" readonly="true" /> <br />

<label for="tags">Tags:</label> <g:textField id="infoTags" name="tags"
	value="${tags.spaceDelimitedTagsForDomain}" /> <br />

<g:hiddenField id="infoAbsPath" name="absolutePath"
	value="${collection.collectionName}" />

<button type="button" id="updateTags" value="updateTags"
	onclick="updateTags()")>Update Tags</button>
	
<div id="infoUpdateArea"><!--  div for any updates in info --></div>

</fieldset>