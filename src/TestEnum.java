
public class TestEnum {

	public static void main(String[] args) {
		System.out.println(SeasonEnum.SPRING);// 直接调用常量，就是一个实例

		/** values方法, 返回所有实例 */
		for (SeasonEnum season : SeasonEnum.values()) {
			/**
			 * 如果SeasonEnum没有override
			 * toString的话，打印出来的是枚举类的实例名，这里就是SPRING,SUMMER...
			 */
			System.out.println("call toString(), value is " + season);
			System.out.println("call name(), value is " + season.name());
			System.out.println("call ordianl(), value is " + season.ordinal());
			season.consist();
		}

		/** 根据实例名称返回枚举实例 */
		String spring = "SPRING";
		System.out.println(SeasonEnum.valueOf(spring));
		System.out.println("Declaring Class is "
				+ SeasonEnum.WINTER.getDeclaringClass());

		/** 根据枚举类型和枚举实例名称返回枚举实例 */
		System.out.println(SeasonEnum.valueOf(SeasonEnum.class, "SUMMER"));
	}

}

/**
 * 利用枚举关键字enum,枚举是一个类，可以有属性，也可以没有属性，当前case有两个属性，4个实例;
 * 
 * 既然枚举类是一个类，可以实现接口和继承抽象类(但枚举类默认已经继承了Enum),可以统一实现也可以每个实例各个实现
 * 
 * @author smwang
 * 
 */
enum SeasonEnum implements Revenue {
	/** 去掉重复部分 */
	// public static final Season SPRING = new Season("spring",
	// "this is spring");
	// public static final Season SUMMER = new Season("spring",
	// "this is summer");
	// public static final Season AUTUMN = new Season("spring",
	// "this is autumn");
	// public static final Season WINTER = new Season("spring",
	// "this is winter");
	SPRING("spring", "this is spring"), SUMMER("spring", "this is summer") {
		public void consist() {
			System.out.println("consist of summer ");
		}
	},
	AUTUMN("spring", "this is autumn"), WINTER("spring", "this is winter") {
		public void consist() {
			System.out.println("consist of winter ");
		}
	};

	private String seasonName;
	private String desc;

	/** 构造私有不被外界实例化 */
	private SeasonEnum(String seasonName, String desc) {
		this.seasonName = seasonName;
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Season [seasonName=" + seasonName + ", desc=" + desc + "]";
	}

	@Override
	/**统一实现*/
	public void consist() {
		System.out.println(" default consist ");
	}

}

interface Revenue {
	void consist();
}