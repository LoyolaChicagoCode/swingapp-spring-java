package helloworld;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main {
	public static void main(final String... args) {
		final ClassPathResource res = new ClassPathResource("beans.xml");
		new XmlBeanFactory(res).getBean("start");
	}
}
