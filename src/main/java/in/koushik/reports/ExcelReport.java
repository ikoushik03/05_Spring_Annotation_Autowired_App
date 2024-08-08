package in.koushik.reports;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("excel")
//@Primary
public class ExcelReport implements IReport{

	@Override
	public void generateReport() {
		System.out.println("ExcelReport is generated");
	}

}
