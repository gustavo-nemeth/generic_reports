# Relatórios Genéricos

## Descrição

Aplicação com o enfoque de abstrair a biblioteca [Dynamic Reports](http://dynamicreports.org/) para a produção de relatórios em uma tabela.
Projeto criado utilizando a IDE [Spring Tool Suite](https://spring.io/tools).

## Utilização

Para gerar um relatório, na classe App, refatore a chamada do método ListaCollection.gerarRelatório() para o envio para uma lista da classe de sua escolha, como apresenta no exemplo.

O design dos relatórios podem ser definidos nas classes Templates e ReportCustomizer. Aonde Templates vão as implementações mais abrangentes e os dados estáticos, e o ReportCustomizer para as customizações específicas (Podendo ser replicado, caso seja usado multiplos relatórios).

## Licença

Código aberto para alteração e melhorias sob a licença MIT.
