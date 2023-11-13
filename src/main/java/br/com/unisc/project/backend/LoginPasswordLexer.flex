package br.com.unisc.project.backend;
import java_cup.runtime.Symbol;

%%

%class LoginPasswordLexer
%full
%cup
%line
%char

%eofval{
	return new Symbol(Tokens.EOF,new String("Fim do arquivo"));
%eofval}

// Definindo tokens
LETTER      = [a-zA-Z]
DIGIT       = [0-9]
SPACE       = [\t|\f|" "|\r|\n]
SPECIAL     = [!@#%&*(-_+=~`}<>,.?]

%%

// Regras
{LETTER}+   { return new Symbol(PasswordSym.LETTER, yytext()); }
{DIGIT}+    { return new Symbol(PasswordSym.DIGIT, yytext()); }
{SPECIAL}+  { return new Symbol(PasswordSym.SPECIAL, yytext()); }
<<EOF>>     { return new Symbol(PasswordSym.EOF); }
{SPACE}	{}
.           { System.out.println("Caracter ilegal: " + yytext());  }