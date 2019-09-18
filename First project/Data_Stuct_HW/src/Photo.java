
public class Photo {
	protected float pixel;
	protected float numByte;
	
	public Photo() {
		pixel=0.0f;
		numByte=0.0f;
	}
	
	public Photo(float pixel, float numByte) {
		super();
		this.pixel = pixel;
		this.numByte = numByte;
	}

	public Photo(Photo other) {
		this.pixel=other.pixel;
		this.numByte=other.numByte;
	}
	
	public float getPixel() {
		return pixel;
	}

	public void setPixel(float pixel) {
		this.pixel = pixel;
	}

	public float getNumByte() {
		return numByte;
	}

	public void setNumByte(float numByte) {
		this.numByte = numByte;
	}

	@Override
	public String toString() {
		return "Photo [pixel=" + pixel + ", numByte=" + numByte + "]";
	}
	
	
	

}

