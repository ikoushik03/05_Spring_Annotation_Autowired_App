package in.koushik.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.ApplicationContext;

import in.koushik.cfg.AppConfig;
import in.koushik.service.ReportService;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ReportService bean = context.getBean(ReportService.class);
		
		
		bean.generate();
		
		
		
	}

}
