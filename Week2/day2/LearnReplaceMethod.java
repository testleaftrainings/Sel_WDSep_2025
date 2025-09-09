package week2.day2;

public class LearnReplaceMethod {

	public static void main(String[] args) {
		String value="TestLeaf is your no.1 favourite Automation Partner";
		String replace = value.replace("your", "our");
		System.out.println(replace);
		String regex1 ="abc ABC 123 _!@";// 14
		String replaceAll = regex1.replaceAll("[^a-zA-Z]", "%");
		System.out.println(replaceAll);
		String substring = regex1.substring(2, 13);
		System.out.println(substring);

	}

}
