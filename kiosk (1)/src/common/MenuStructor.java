package common;

public class MenuStructor {
	private String title;
	private int price;
	private String img;
	private String img2;
	private int count = 1;
	private int total;

	public String getMenuTitle() {
		return this.title;
	}

	public int getMenuPrice() {
		return this.price;
	}

	public String getMenuImg() {
		return this.img;
	}
	public String getMenuImg2() {
		return this.img2;
	}

	public int getMenuTotal() {
		return this.total;
	}
	
	public int getMenuCount() {
		return this.count;
	}
	
	public void addMenu() {
		this.count = ++count;
		this.total = count*price;
		System.out.println(total);
	}
	
	public boolean minusMenu() {//1개 밑일 경우 없애기 위해서
		if(this.count!=1) {
			this.count = --count;
			this.total = count*price;
			return true;
		}else {
			return false;
		}
	}
	
	public MenuStructor(String title, int price, String img,String img2) {
		this.title = title;
		this.price = price;
		this.img = img;
		this.img2 = img2;
		this.total = price;
	}
	public MenuStructor(String title, int price, String img) {
		this.title = title;
		this.price = price;
		this.img = img;
		this.img2 = img;
		this.total = price;
	}
}

