public class House {
	protected int id;
	protected float price;
	protected String location;
	protected String advertiser;
	protected Photo image;
	
	public House() {
		id=0;
		price=0.0f;
		location ="";
		advertiser="";
		this.image =null;		
	}
	public House(int id, float price, String location, String advertiser, Photo image) {
		this.id=id;
		this.price=price;
		this.location=location;
		this.advertiser=advertiser;
		this.image=image;
	}
	public House(House other) {
		this.id=other.id;
		this.price=other.price;
		this.location=other.location;
		this.advertiser=other.advertiser;
		this.image=other.image;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAdvertiser() {
		return advertiser;
	}
	public void setAdvertiser(String advertiser) {
		this.advertiser = advertiser;
	}
	public Photo getImage() {
		return image;
	}
	public void setImage(Photo image) {
		this.image = image;
	}
	

}

