package br.com.sattra.generic_relatory.template;
import net.sf.dynamicreports.adhoc.configuration.AdhocReport;
import net.sf.dynamicreports.adhoc.report.DefaultAdhocReportCustomizer;
import net.sf.dynamicreports.report.builder.ReportBuilder;
import net.sf.dynamicreports.report.exception.DRException;

public class ReportCustomizer extends DefaultAdhocReportCustomizer {

	/*
	 *  Templates -> Padronização da empresa, Nome da empresa, logo, cores padrão
	 *  ReportCustomizer -> Customização do relatório (Nome do relatório, informações)
	 */
	
	
		@Override
		public void customize(ReportBuilder<?> report, AdhocReport adhocReport) throws DRException {

			super.customize(report, adhocReport);
			
			report.setTemplate(Templates.reportTemplate);
			report.title(Templates.createTitleComponent("Lista"));
			report.pageFooter(Templates.footerComponent);

		}

}