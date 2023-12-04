package br.com.unisc.project.backend;
import java_cup.runtime.Symbol;

/*
Directivas:
public: classe publica
cup: compatibilidade com cup
full: estende o alfabeto com todos os valores de 8 bits
linha: adicionar a variável int yyline, para indicar a linha do lexema
char: adicionar a variável int yychar, para indicar o índice do primeiro caractere do lexema
ignorecase: validar, independentemente de a letra ser maiúscula ou minúscula
eofval: especifica um valor de retorno no final do arquivo
*/

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
especial = [!@#%&*(-_+=~`}<>,.?]
%%

{digito}+	{return new Symbol(Tokens.NUMERO, new Integer(yytext()));}
{letra}+	{return new Symbol(Tokens.LETRA, yytext());}
{especial}+	{return new Symbol(Tokens.ESPECIAL, yytext());}
{espaco}	{}
.           { System.out.println("Caracter ilegal: " + yytext()); }
