package common;

public class MenuObject {
	//탭 메뉴
	public final static String[] korMenu = {"국", "볶음","면", "샐러드", "음료"};
	public final static String[] engMenu = {"Rice", "Topping", "Sauce", "Side dish", "Soup ", "Beverage"};

	public  static MenuStructor[] riceMenuKor = {new MenuStructor("소고기무국", 8000, "images/rice/소고기무국.jpg","images/img1/소고기무국.png"),
			new MenuStructor("해물순두부찌개", 12000, "images/rice/순두부찌개.jpg","images/img1/순두부찌개.png"), new MenuStructor("차돌된장찌개", 10000, "images/rice/차돌된장찌개.jpg","images/img1/차돌 된장찌개.png"), 
			new MenuStructor("김치찌개", 10000, "images/rice/김치찌개.jpg","images/img1/김치찌개.png"), new MenuStructor("육개장", 9000, "images/rice/육개장.jpg","images/img1/육개장.png"),
			new MenuStructor("부대찌개", 12000, "images/rice/부대찌개.jpg","images/img1/부대찌개.png")};
	
	public static MenuStructor[] toppingMenuKor = {new MenuStructor("새우볶음밥", 500, "images/source/새우볶음밥.jpg","images/img4/새우볶음밥.png"),
			new MenuStructor("불고기", 300, "images/source/불고기.jpg","images/img4/불고기.png"), new MenuStructor("제육볶음", 100, "images/source/제육.jpg","images/img4/제육볶음.png"), 
			new MenuStructor("오삼불고기", 400, "images/source/오삼불고기.jpg","images/img4/오삼불고기.png"), new MenuStructor("오징어볶음", 600, "images/source/오징어볶음.jpg","images/img4/오징어볶음.png"),
			new MenuStructor("낙지볶음", 500, "images/source/낙지볶음.jpg","images/img4/낙지볶음.png")};
	
	public static MenuStructor[] sauceMenuKor = {new MenuStructor("닭칼국수", 500, "images/topping/닭칼국수.jpg","images/img3/닭칼국수.png"),
			new MenuStructor("바지락 봉골레파스타", 300, "images/topping/바지락봉골레파스타.jpg","images/img3/바지락 봉글레 파스타.png"), new MenuStructor("트러플크림파스타", 100, "images/topping/트러플크림파스타.jpg","images/img3/트러플 크림 파스타.png"), 
			new MenuStructor("마제소바", 400, "images/topping/마제소바.jpg","images/img3/마제소바.png"), new MenuStructor("쉬림프 로제파스타", 400, "images/topping/쉬림프로제파스타.jpg","images/img3/쉬림프 로재 파스타.png"),
			new MenuStructor("딱새우 해물짬뽕", 400, "images/topping/딱새우해물짬뽕.jpg","images/img3/딱새우 해물짬뽕.png")};
	
	public static MenuStructor[] sideMenuKor = {new MenuStructor("그린 샐러드", 4200, "images/sidedish/그린 샐러드2.jpg","images/img2/그린샐러드.png"),
			new MenuStructor("크래미 샐러드", 5500, "images/sidedish/크래미 샐러드.jpg","images/img2/크래미 샐러드.png"), new MenuStructor("닭가슴살 샐러드", 5500, "images/sidedish/닭가슴살 샐러드.jpg","images/img2/그린샐러드.png"), 
			new MenuStructor("파스타 샐러드", 6000, "images/sidedish/파스타 샐러드.jpg","images/img2/파스타샐러드.png"), new MenuStructor("치즈 샐러드", 6000, "images/sidedish/치즈 샐러드.jpg","images/img2/치즈샐러드.png"), 
			new MenuStructor("불고기 샐러드", 5800, "images/sidedish/불고기 샐러드.jpg","images/img2/불고기 샐러드.png")};

	public static MenuStructor[] beverageMenuKor = {new MenuStructor("펩시", 300, "images/beverage/펩시.jpg"),
			new MenuStructor("마운틴듀", 300, "images/beverage/마운틴듀.jpg"), new MenuStructor("미숫가루", 100, "images/beverage/미숫가루.jpg"), 
			new MenuStructor("밀키스", 300, "images/beverage/밀키스.jpg"), new MenuStructor("바닐라라떼", 100, "images/beverage/바닐라라떼.jpg"),
			new MenuStructor("스파클링오렌지", 300, "images/beverage/스파클링오렌지.jpg"), new MenuStructor("스프라이트", 300, "images/beverage/스프라이트.jpg"),
			new MenuStructor("아메리카노", 100, "images/beverage/아메리카노.jpg"), new MenuStructor("핫식스", 100, "images/beverage/핫식스.jpg"),
			new MenuStructor("아이스티", 300, "images/beverage/아이스티.jpg"), new MenuStructor("코카콜라", 100, "images/beverage/코카콜라.jpg")};

public  static MenuStructor[] riceMenuEng = {new MenuStructor("cooked rice", 800, "images/rice/쌀밥.jpg"),
		new MenuStructor("bean rice", 1000, "images/rice/콩밥.jpg"), new MenuStructor("joe rice", 1000, "images/rice/조밥.jpg"), 
		new MenuStructor("Red bean rice", 1000, "images/rice/팥밥.jpg"), new MenuStructor("Bori rice", 1000, "images/rice/보리밥.jpg"),
		new MenuStructor("bean sprouts.", 1300, "images/rice/콩나물밥.jpg"), new MenuStructor("bean rice", 1000, "images/rice/콩밥.jpg"),
		new MenuStructor("mixed rice", 1300, "images/rice/잡곡밥.jpg"), new MenuStructor("Gonde rice", 1300, "images/rice/곤드레밥.jpg"),
		new MenuStructor("bamboo rice", 1300, "images/rice/대나무밥.png")};
public final static MenuStructor[] toppingMenuEng = {new MenuStructor("Egg", 500, "images/topping/계란.jpg"),
		new MenuStructor("sweet potato stalks", 300, "images/topping/고구마 줄기.jpg"), new MenuStructor("Bracken", 100, "images/topping/고사리.png"), 
		new MenuStructor("oyster mushroom", 400, "images/topping/느타리버슷.jpg"), new MenuStructor("Sea tangle", 600, "images/topping/다시마.png"),
		new MenuStructor("Carrot", 500, "images/topping/당근.png"), new MenuStructor("Chicken breast", 400, "images/topping/닭가슴살.jpg"),
		new MenuStructor("nonliving bond", 600, "images/topping/무생채.jpg"), new MenuStructor("Seaweed", 300, "images/topping/미역.jpg"),
		new MenuStructor("Lettuce", 700, "images/topping/상추.jpg"), new MenuStructor("fresh vegetables", 700, "images/topping/새싹채소.png"),
		new MenuStructor("Beef", 700, "images/topping/쇠고기.png"), new MenuStructor("Spinach", 700, "images/topping/시금치.png"),
		new MenuStructor("Korean style raw beef", 700, "images/topping/육회.png"), new MenuStructor("amber", 700, "images/topping/애호박.jpg"),
		new MenuStructor("cockle", 700, "images/topping/꼬막.png"), new MenuStructor("fried eggplant", 700, "images/topping/가지볶음.png")};
public final static MenuStructor[] sauceMenuEng = {new MenuStructor("special hot pepper paste", 500, "images/source/특제고추장.png"),
		new MenuStructor("Kang Do-jang", 300, "images/source/강된장.jpg"), new MenuStructor("red pepper paste", 100, "images/source/고추장.jpg"), 
		new MenuStructor("beef red pepper paste", 400, "images/source/소고기 고추장.jpg")};
public final static MenuStructor[] sideMenuEng = {new MenuStructor("감자만두", 500, "images/sidedish/감자만두.jpg"),
		new MenuStructor("Rolled Omelet", 300, "images/sidedish/계란말이.jpg"), new MenuStructor("Steamed eggs", 100, "images/sidedish/계란찜.jpg"), 
		new MenuStructor("Kimchi dumplings", 300, "images/sidedish/김치만두.jpg"), new MenuStructor("Gummandu", 100, "images/sidedish/군만두.jpg"), 
		new MenuStructor("beef stew", 300, "images/sidedish/소고기 조림.jpg"), new MenuStructor("fried sausage and vegetable", 100, "images/sidedish/소야.jpg"), 
		new MenuStructor("Stir-fried Sundae", 300, "images/sidedish/순대볶음.png"), new MenuStructor("Squid sushi rolls", 100, "images/sidedish/오징어초무침.jpg"),
		new MenuStructor("steamed dumpling", 100, "images/sidedish/찐만두.jpg"), new MenuStructor("braised mackerel", 300, "images/sidedish/고등어조림.png")};
public final static MenuStructor[] soupMenuEng = {new MenuStructor("Kimchi stew", 500, "images/soup/김치찌개.jpg"),
		new MenuStructor("Kimchi soup", 300, "images/soup/김칫국.jpg"), new MenuStructor("Soybean Paste Soup", 100, "images/soup/된장국.png"), 
		new MenuStructor("blowfish soup", 300, "images/soup/복어국.jpg"), new MenuStructor("bean sprout soup", 100, "images/soup/콩나물국.jpg")};
public final static MenuStructor[] beverageMenuEng = {new MenuStructor("pepsi", 300, "images/beverage/펩시.jpg"),
		new MenuStructor("Mountain Dew", 300, "images/beverage/마운틴듀.jpg"), new MenuStructor("Powder made of mixed grains", 100, "images/beverage/미숫가루.jpg"), 
		new MenuStructor("Milkis", 300, "images/beverage/밀키스.jpg"), new MenuStructor("Vanilla latte", 100, "images/beverage/바닐라라떼.jpg"),
		new MenuStructor("Sparkling Orange", 300, "images/beverage/스파클링오렌지.jpg"), new MenuStructor("Sprite", 300, "images/beverage/스프라이트.jpg"),
		new MenuStructor("Americano", 100, "images/beverage/아메리카노.jpg"), new MenuStructor("Hot Six", 100, "images/beverage/핫식스.jpg"),
		new MenuStructor("iced tea", 300, "images/beverage/아이스티.jpg"), new MenuStructor("Coca Cola", 100, "images/beverage/코카콜라.jpg")};
}
