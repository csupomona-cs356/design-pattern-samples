package edu.csupomona.cs356.adapter.shorturl;

import retrofit.RestAdapter;
import retrofit.converter.JacksonConverter;

public class ShortenUrlServiceImpl implements ShortenUrlService {

	private RestAdapter restAdapter = new RestAdapter.Builder()
		    .setEndpoint("https://www.googleapis.com")
		    .setConverter(new JacksonConverter())
		    .build();

	private GoogleService googleService = restAdapter.create(GoogleService.class);

	public UrlResponse getShortUrl(String longUrl) {
		return googleService.getShortUrl(new LongUrl(longUrl));
	}

	public UrlResponse expandShortUrl(String shortUrl) {
		return googleService.expandShortUrl(shortUrl);
	}

	public static void main(String[] args) {
		ShortenUrlService service = new ShortenUrlServiceImpl();
		UrlResponse response = service.getShortUrl("The-assignment-has-been-extended-to-Sunday");

		System.out.println(response.getId());
		System.out.println(response.getKind());
		System.out.println(response.getLongUrl());

		response = service.expandShortUrl("http://goo.gl/K7fZyJ");

		System.out.println(response.getId());
		System.out.println(response.getKind());
		System.out.println(response.getLongUrl());
	}
}
