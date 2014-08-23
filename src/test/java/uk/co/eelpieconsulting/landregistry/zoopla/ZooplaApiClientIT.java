package uk.co.eelpieconsulting.landregistry.zoopla;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import uk.co.eelpieconsulting.common.http.HttpBadRequestException;
import uk.co.eelpieconsulting.common.http.HttpFetchException;
import uk.co.eelpieconsulting.common.http.HttpForbiddenException;
import uk.co.eelpieconsulting.common.http.HttpNotFoundException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class ZooplaApiClientIT {

	@Test
	public void canFetchListings() throws JsonParseException, JsonMappingException, HttpNotFoundException, HttpBadRequestException, HttpForbiddenException, HttpFetchException, IOException {
		ZooplaApiClient client = new ZooplaApiClient("api-key");
		
		final List<Listing> listings = client.getListingsForArea("Twickenham, London");		
		assertFalse(listings.isEmpty());
		
		final Listing firstListing = listings.get(0);
		final Listing singleListing = client.getListing(firstListing.getListing_id());

		assertEquals(firstListing.getListing_id(), singleListing.getListing_id());
		assertEquals(firstListing.getDescription(), singleListing.getDescription());
	}

}
