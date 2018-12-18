package tantoPer.RSshooting;

public class Square {
	Integer xPosition;
	Integer yPosition;
	Integer sizeX;
	Integer sizeY;
	String fileName;

	public Square(Integer xPosition, Integer yPosition, Integer sizeX, Integer sizeY, String fileName) {
		super();
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Integer getxPosition() {
		return xPosition;
	}

	public void setxPosition(Integer xPosition) {
		this.xPosition = xPosition;
	}

	public Integer getyPosition() {
		return yPosition;
	}

	public void setyPosition(Integer yPosition) {
		this.yPosition = yPosition;
	}

	public Integer getSizeX() {
		return sizeX;
	}

	public void setSizeX(Integer sizeX) {
		this.sizeX = sizeX;
	}

	public Integer getSizeY() {
		return sizeY;
	}

	public void setSizeY(Integer sizeY) {
		this.sizeY = sizeY;
	}
	
}
