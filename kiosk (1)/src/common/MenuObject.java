package common;

public class MenuObject {
	//�� �޴�
	public final static String[] korMenu = {"��", "����","��", "������", "����"};
	public final static String[] engMenu = {"Rice", "Topping", "Sauce", "Side dish", "Soup ", "Beverage"};

	public  static MenuStructor[] riceMenuKor = {new MenuStructor("�Ұ�⹫��", 8000, "images/rice/�Ұ�⹫��.jpg","images/img1/�Ұ�⹫��.png"),
			new MenuStructor("�ع����κ��", 12000, "images/rice/���κ��.jpg","images/img1/���κ��.png"), new MenuStructor("���������", 10000, "images/rice/���������.jpg","images/img1/���� �����.png"), 
			new MenuStructor("��ġ�", 10000, "images/rice/��ġ�.jpg","images/img1/��ġ�.png"), new MenuStructor("������", 9000, "images/rice/������.jpg","images/img1/������.png"),
			new MenuStructor("�δ��", 12000, "images/rice/�δ��.jpg","images/img1/�δ��.png")};
	
	public static MenuStructor[] toppingMenuKor = {new MenuStructor("���캺����", 500, "images/source/���캺����.jpg","images/img4/���캺����.png"),
			new MenuStructor("�Ұ��", 300, "images/source/�Ұ��.jpg","images/img4/�Ұ��.png"), new MenuStructor("��������", 100, "images/source/����.jpg","images/img4/��������.png"), 
			new MenuStructor("����Ұ��", 400, "images/source/����Ұ��.jpg","images/img4/����Ұ��.png"), new MenuStructor("��¡���", 600, "images/source/��¡���.jpg","images/img4/��¡���.png"),
			new MenuStructor("��������", 500, "images/source/��������.jpg","images/img4/��������.png")};
	
	public static MenuStructor[] sauceMenuKor = {new MenuStructor("��Į����", 500, "images/topping/��Į����.jpg","images/img3/��Į����.png"),
			new MenuStructor("������ �����Ľ�Ÿ", 300, "images/topping/�����������Ľ�Ÿ.jpg","images/img3/������ ���۷� �Ľ�Ÿ.png"), new MenuStructor("Ʈ����ũ���Ľ�Ÿ", 100, "images/topping/Ʈ����ũ���Ľ�Ÿ.jpg","images/img3/Ʈ���� ũ�� �Ľ�Ÿ.png"), 
			new MenuStructor("�����ҹ�", 400, "images/topping/�����ҹ�.jpg","images/img3/�����ҹ�.png"), new MenuStructor("������ �����Ľ�Ÿ", 400, "images/topping/�����������Ľ�Ÿ.jpg","images/img3/������ ���� �Ľ�Ÿ.png"),
			new MenuStructor("������ �ع�«��", 400, "images/topping/�������ع�«��.jpg","images/img3/������ �ع�«��.png")};
	
	public static MenuStructor[] sideMenuKor = {new MenuStructor("�׸� ������", 4200, "images/sidedish/�׸� ������2.jpg","images/img2/�׸�������.png"),
			new MenuStructor("ũ���� ������", 5500, "images/sidedish/ũ���� ������.jpg","images/img2/ũ���� ������.png"), new MenuStructor("�߰����� ������", 5500, "images/sidedish/�߰����� ������.jpg","images/img2/�׸�������.png"), 
			new MenuStructor("�Ľ�Ÿ ������", 6000, "images/sidedish/�Ľ�Ÿ ������.jpg","images/img2/�Ľ�Ÿ������.png"), new MenuStructor("ġ�� ������", 6000, "images/sidedish/ġ�� ������.jpg","images/img2/ġ�������.png"), 
			new MenuStructor("�Ұ�� ������", 5800, "images/sidedish/�Ұ�� ������.jpg","images/img2/�Ұ�� ������.png")};

	public static MenuStructor[] beverageMenuKor = {new MenuStructor("���", 300, "images/beverage/���.jpg"),
			new MenuStructor("����ƾ��", 300, "images/beverage/����ƾ��.jpg"), new MenuStructor("�̼�����", 100, "images/beverage/�̼�����.jpg"), 
			new MenuStructor("��Ű��", 300, "images/beverage/��Ű��.jpg"), new MenuStructor("�ٴҶ��", 100, "images/beverage/�ٴҶ��.jpg"),
			new MenuStructor("����Ŭ��������", 300, "images/beverage/����Ŭ��������.jpg"), new MenuStructor("��������Ʈ", 300, "images/beverage/��������Ʈ.jpg"),
			new MenuStructor("�Ƹ޸�ī��", 100, "images/beverage/�Ƹ޸�ī��.jpg"), new MenuStructor("�ֽĽ�", 100, "images/beverage/�ֽĽ�.jpg"),
			new MenuStructor("���̽�Ƽ", 300, "images/beverage/���̽�Ƽ.jpg"), new MenuStructor("��ī�ݶ�", 100, "images/beverage/��ī�ݶ�.jpg")};

public  static MenuStructor[] riceMenuEng = {new MenuStructor("cooked rice", 800, "images/rice/�ҹ�.jpg"),
		new MenuStructor("bean rice", 1000, "images/rice/���.jpg"), new MenuStructor("joe rice", 1000, "images/rice/����.jpg"), 
		new MenuStructor("Red bean rice", 1000, "images/rice/�Ϲ�.jpg"), new MenuStructor("Bori rice", 1000, "images/rice/������.jpg"),
		new MenuStructor("bean sprouts.", 1300, "images/rice/�ᳪ����.jpg"), new MenuStructor("bean rice", 1000, "images/rice/���.jpg"),
		new MenuStructor("mixed rice", 1300, "images/rice/����.jpg"), new MenuStructor("Gonde rice", 1300, "images/rice/��巹��.jpg"),
		new MenuStructor("bamboo rice", 1300, "images/rice/�볪����.png")};
public final static MenuStructor[] toppingMenuEng = {new MenuStructor("Egg", 500, "images/topping/���.jpg"),
		new MenuStructor("sweet potato stalks", 300, "images/topping/���� �ٱ�.jpg"), new MenuStructor("Bracken", 100, "images/topping/��縮.png"), 
		new MenuStructor("oyster mushroom", 400, "images/topping/��Ÿ������.jpg"), new MenuStructor("Sea tangle", 600, "images/topping/�ٽø�.png"),
		new MenuStructor("Carrot", 500, "images/topping/���.png"), new MenuStructor("Chicken breast", 400, "images/topping/�߰�����.jpg"),
		new MenuStructor("nonliving bond", 600, "images/topping/����ä.jpg"), new MenuStructor("Seaweed", 300, "images/topping/�̿�.jpg"),
		new MenuStructor("Lettuce", 700, "images/topping/����.jpg"), new MenuStructor("fresh vegetables", 700, "images/topping/����ä��.png"),
		new MenuStructor("Beef", 700, "images/topping/����.png"), new MenuStructor("Spinach", 700, "images/topping/�ñ�ġ.png"),
		new MenuStructor("Korean style raw beef", 700, "images/topping/��ȸ.png"), new MenuStructor("amber", 700, "images/topping/��ȣ��.jpg"),
		new MenuStructor("cockle", 700, "images/topping/����.png"), new MenuStructor("fried eggplant", 700, "images/topping/��������.png")};
public final static MenuStructor[] sauceMenuEng = {new MenuStructor("special hot pepper paste", 500, "images/source/Ư��������.png"),
		new MenuStructor("Kang Do-jang", 300, "images/source/������.jpg"), new MenuStructor("red pepper paste", 100, "images/source/������.jpg"), 
		new MenuStructor("beef red pepper paste", 400, "images/source/�Ұ�� ������.jpg")};
public final static MenuStructor[] sideMenuEng = {new MenuStructor("���ڸ���", 500, "images/sidedish/���ڸ���.jpg"),
		new MenuStructor("Rolled Omelet", 300, "images/sidedish/�������.jpg"), new MenuStructor("Steamed eggs", 100, "images/sidedish/�����.jpg"), 
		new MenuStructor("Kimchi dumplings", 300, "images/sidedish/��ġ����.jpg"), new MenuStructor("Gummandu", 100, "images/sidedish/������.jpg"), 
		new MenuStructor("beef stew", 300, "images/sidedish/�Ұ�� ����.jpg"), new MenuStructor("fried sausage and vegetable", 100, "images/sidedish/�Ҿ�.jpg"), 
		new MenuStructor("Stir-fried Sundae", 300, "images/sidedish/���뺺��.png"), new MenuStructor("Squid sushi rolls", 100, "images/sidedish/��¡���ʹ�ħ.jpg"),
		new MenuStructor("steamed dumpling", 100, "images/sidedish/�𸸵�.jpg"), new MenuStructor("braised mackerel", 300, "images/sidedish/��������.png")};
public final static MenuStructor[] soupMenuEng = {new MenuStructor("Kimchi stew", 500, "images/soup/��ġ�.jpg"),
		new MenuStructor("Kimchi soup", 300, "images/soup/��ĩ��.jpg"), new MenuStructor("Soybean Paste Soup", 100, "images/soup/���屹.png"), 
		new MenuStructor("blowfish soup", 300, "images/soup/���.jpg"), new MenuStructor("bean sprout soup", 100, "images/soup/�ᳪ����.jpg")};
public final static MenuStructor[] beverageMenuEng = {new MenuStructor("pepsi", 300, "images/beverage/���.jpg"),
		new MenuStructor("Mountain Dew", 300, "images/beverage/����ƾ��.jpg"), new MenuStructor("Powder made of mixed grains", 100, "images/beverage/�̼�����.jpg"), 
		new MenuStructor("Milkis", 300, "images/beverage/��Ű��.jpg"), new MenuStructor("Vanilla latte", 100, "images/beverage/�ٴҶ��.jpg"),
		new MenuStructor("Sparkling Orange", 300, "images/beverage/����Ŭ��������.jpg"), new MenuStructor("Sprite", 300, "images/beverage/��������Ʈ.jpg"),
		new MenuStructor("Americano", 100, "images/beverage/�Ƹ޸�ī��.jpg"), new MenuStructor("Hot Six", 100, "images/beverage/�ֽĽ�.jpg"),
		new MenuStructor("iced tea", 300, "images/beverage/���̽�Ƽ.jpg"), new MenuStructor("Coca Cola", 100, "images/beverage/��ī�ݶ�.jpg")};
}
