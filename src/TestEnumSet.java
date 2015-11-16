import java.util.EnumSet;

public class TestEnumSet {

	public static void main(String[] args) {
		EnumSet<SeasonEnum> enumSet = EnumSet.noneOf(SeasonEnum.class);
		enumSet.add(SeasonEnum.AUTUMN);
		System.out.println(enumSet);

		enumSet = EnumSet.allOf(SeasonEnum.class);//返回指定枚举类的所有实例
		System.out.println(enumSet);

		enumSet = EnumSet.of(SeasonEnum.WINTER, SeasonEnum.AUTUMN);//添加两个枚举实例
		System.out.println(enumSet);

		enumSet = EnumSet.range(SeasonEnum.AUTUMN, SeasonEnum.WINTER);//返回指定范围的枚举实例
		System.out.println(enumSet);
	}

}
