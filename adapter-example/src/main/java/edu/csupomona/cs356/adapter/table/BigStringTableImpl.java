package edu.csupomona.cs356.adapter.table;

import edu.csupomona.cs356.adapter.shorturl.ShortenUrlService;
import edu.csupomona.cs356.adapter.shorturl.ShortenUrlServiceImpl;
import edu.csupomona.cs356.adapter.shorturl.UrlResponse;

public class BigStringTableImpl implements BigStringTable {

	private ShortenUrlService shortenUrlService = new ShortenUrlServiceImpl();

	public String put(String value) {
		UrlResponse response = shortenUrlService.getShortUrl(value);
		return response.getId().substring(14);
	}

	public String get(String key) {
		UrlResponse response = shortenUrlService
				.expandShortUrl("http://goo.gl/" + key);
		return response.getLongUrl().substring(7);
	}

}
