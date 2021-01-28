module app.financeiro {
	
	requires java.base;  // já importado por padrão.
//	requires app.calculo;
	requires app.api;
	uses br.com.cod3r.app.Calculadora;
}