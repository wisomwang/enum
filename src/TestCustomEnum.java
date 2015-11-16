public class TestCustomEnum {

	public static void main(String[] args) {
		System.out.println(Season.SPRING);// 直接调用常量，就是一个实例
	}

}

/**
 * 自定义枚举类，枚举类有限个实例，一个实例的时候可以用作是单态
 * 
 * @author smwang
 * 
 */

class Season {
	public static final Season SPRING = new Season("spring", "this is spring");
	public static final Season SUMMER = new Season("spring", "this is summer");
	public static final Season AUTUMN = new Season("spring", "this is autumn");
	public static final Season WINTER = new Season("spring", "this is winter");

	private String seasonName;
	private String desc;

	/** 构造私有不被外界实例化 */
	private Season(String seasonName, String desc) {
		this.seasonName = seasonName;
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Season [seasonName=" + seasonName + ", desc=" + desc + "]";
	}

}
