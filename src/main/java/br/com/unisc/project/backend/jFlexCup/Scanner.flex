package br.com.unisc.project.backend;
import java_cup.runtime.Symbol;

%%

%class Scanner
%cup
%full
%line
%char

%eofval{
	return new Symbol(Tokens.EOF,new String("Fim do arquivo"));
%eofval}

digito = [0-9]
letra = [a-zA-Z]
espaco = \t|\f|" "|\r|\n
separacao = [+]
especial = [!@#%&*(-_=~`}<>,.?]
%%

{digito}+	 {return new Symbol(Tokens.NUMERO, new Integer(yytext()));}
{letra}+	 {return new Symbol(Tokens.LETRA, yytext());}
{separacao}+ {return new Symbol(Tokens.SEPARACAO, yytext());}
{especial}+	 {return new Symbol(Tokens.ESPECIAL, yytext());}
{espaco}	 {}
.            { System.out.println("Caracter ilegal: " + yytext()); }
