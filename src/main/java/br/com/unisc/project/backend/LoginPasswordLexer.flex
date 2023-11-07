package br.com.unisc.project.backend;
import java_cup.runtime.Symbol;

%class LoginLexer
%unicode

%{
import java_cup.runtime.Symbol;
%}

%state IN_NAME
%state IN_LAST_NAME
%state IN_BIRTHDATE
%state IN_SITE_OR_SECTOR

%init{
    String currentToken = null;
%}

%%
"Nome" {
    currentToken = "Nome";
    yybegin(IN_NAME);
}

<IN_NAME>[A-Za-z]+ {
    return new Symbol(LoginParser.NAME, yytext());
}

"Sobrenome" {
    currentToken = "Sobrenome";
    yybegin(IN_LAST_NAME);
}

<IN_LAST_NAME>[A-Za-z]+ {
    return new Symbol(LoginParser.LAST_NAME, yytext());
}

"Data de nascimento" {
    currentToken = "Data de nascimento";
    yybegin(IN_BIRTHDATE);
}

<IN_BIRTHDATE>[0-9]{2}/[0-9]{2}/[0-9]{4} {
    return new Symbol(LoginParser.BIRTHDATE, yytext());
}

"Site ou Setor" {
    currentToken = "Site ou Setor";
    yybegin(IN_SITE_OR_SECTOR);
}

<IN_SITE_OR_SECTOR>[A-Za-z0-9]+ {
    return new Symbol(LoginParser.SITE_OR_SECTOR, yytext());
}

<YYINITIAL>\n|\r|\r\n {
    // Ignore quebras de linha
}

<IN_NAME>[ \t]+ {
    // Ignore espaços e tabulações
}

<IN_LAST_NAME>[ \t]+ {
    // Ignore espaços e tabulações
}

<IN_BIRTHDATE>[ \t]+ {
    // Ignore espaços e tabulações
}

<IN_SITE_OR_SECTOR>[ \t]+ {
    // Ignore espaços e tabulações
}

. {
    return new Symbol(LoginParser.OTHER, yytext());
}
