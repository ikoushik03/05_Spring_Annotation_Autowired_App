package in.koushik.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.koushik.reports.IReport;


@Service
public class ReportService {
	
	@Autowired
	@Qualifier("pdf")
	private IReport report;
	
	public void generate()
	{
		report.generateReport();;
	}

}
