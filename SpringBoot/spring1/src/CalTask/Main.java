package CalTask;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/CalTask/Application.xml");
		Object bean = ctx.getBean("msg");
		DiscountCalculator dis = (DiscountCalculator) bean;
		dis.setPrice(1000.0);
		String res = dis.calculateDiscount("Aakash");
		System.out.println(res);
	}

}