package edu.csupomona.cs356.adapter.shorturl;

public interface ShortenUrlService {

	public UrlResponse getShortUrl(String longUrl);

	public UrlResponse expandShortUrl(String shortUrl);

}