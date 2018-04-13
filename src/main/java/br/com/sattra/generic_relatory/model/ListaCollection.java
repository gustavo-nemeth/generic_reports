package br.com.sattra.generic_relatory.model;

import java.lang.reflect.Field;
import java.util.List;
import java.util.logging.Logger;

import br.com.sattra.generic_relatory.template.ReportCustomizer;
import net.sf.dynamicreports.adhoc.AdhocManager;
import net.sf.dynamicreports.adhoc.configuration.AdhocColumn;
import net.sf.dynamicreports.adhoc.configuration.AdhocConfiguration;
import net.sf.dynamicreports.adhoc.configuration.AdhocReport;
import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
import net.sf.dynamicreports.report.exception.DRException;

public class ListaCollection {

	public void gerarRelatorio(List<Object> list) {

		AdhocConfiguration configuration = new AdhocConfiguration();
		AdhocReport report = new AdhocReport();
		configuration.setReport(report);

		// Toda a tabela será modelada em cima do primeiro objeto da lista
		Class<?> clazz = list.get(0).getClass();
		for (Field field : clazz.getDeclaredFields()) {
			// .toGenericString() Para pedir o tipo do atributo

			AdhocColumn column = new AdhocColumn();
			column.setName(field.getName());
			report.addColumn(column);

			System.out.println(field.getName());
		}

		try {

			JasperReportBuilder reportBuilder = AdhocManager.createReport(configuration.getReport(),
					new ReportCustomizer());

			reportBuilder.setDataSource(list);
			reportBuilder.show();

		} catch (DRException e) {

			e.printStackTrace();

		}

	}

}
