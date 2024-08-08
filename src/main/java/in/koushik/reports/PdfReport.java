package in.koushik.reports;

import org.springframework.stereotype.Component;

@Component("pdf")
public class PdfReport implements IReport{

	@Override
	public void generateReport() {
		System.out.println("Pdf Report is generating");
	}

}
