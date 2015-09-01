package uk.co.eelpieconsulting.landregistry.zoopla;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity("image")
public class Image {

	@Id
	private String url;
	private byte[] data;
	
	public Image() {
	}
	
	public Image(String url, byte[] data) {
		this.url = url;
		this.data = data;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Image [url=" + url + "]";
	}
		
}
