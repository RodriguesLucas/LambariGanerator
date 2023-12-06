
# 1. Introdução

Em um mundo cada vez mais interconectado e dependente da tecnologia, a segurança da informação desempenha um papel fundamental na proteção de dados. Protegendo os usuários dos perigos impostos no âmbito virtual, se torna indispensável a utilização de senhas seguras e complexas para a proteção de suas contas. O'Que acaba não acontecendo muitas vezes com usuários leigos e pequen
as empresas, onde são criadas senhas sem complexidade e muitas vezes esquecidas pelos usuários.
	Pensando nisso, desenvolvemos um gerador de senhas e logins voltado a facilitar para o usuário, mas sem perder a complexidade. 

# 2. Entrada de Dados do Usuário e definição dos atributos.

Após algumas pesquisas entramos em acordo sobre os atributos, os mesmos deveriam ser simples, concentrando a maior complexidade para caracteres especiais e a aleatoriedade da geração.
O usuário fornecerá algumas de suas informações, que são: nome, sobrenome, data de nascimento e uma informação sobre o site que utilizará ou setor que ele trabalha, dependendo de sua necessidade.

# 3. Análise Léxica e Sintática

  A análise léxica e a análise sintática desempenham funções cruciais no processamento de linguagem natural, contribuindo de maneiras distintas para a compreensão e interpretação de textos. No âmbito da análise léxica, há a identificação e categorização das unidades mínimas de significado, conhecidas como lexemas, que englobam palavras e outros elementos, como números e símbolos. Nessa fase, realiza-se a tokenização, dividindo o texto em unidades menores chamadas tokens. Já a análise sintática foca na estrutura gramatical e nas relações entre as palavras, analisando como se agrupam para formar frases e expressões coesas. Essa etapa visa compreender a função de cada palavra na sentença e como elas se conectam sintaticamente, resultando na construção de uma árvore sintática que representa a organização hierárquica da sentença. Ambas as análises desempenham papel fundamental no desenvolvimento de sistemas de processamento de linguagem natural eficientes e precisos.


# 4. Definição da linguagem de programação e IDE

	Para realizar a análise léxica e sintática desta aplicação, adotamos as bibliotecas JFlex e Java CUP em Java, conforme recomendado no escopo deste trabalho, utilizando a IDE Eclipse e IntelliJ.


# 5. Definição e elaboração do Analisador Léxico:

  O sistema utiliza um conjunto de caracteres para determinar a complexidade da senha, que são: 
Dígitos[0-9]
Letra[a-zA-Z]
Espaços[\t|\f|””|\r|\n]
Especial!@#%&*(-=~’}<>,.?]
Separação[+](utilizado internamente para separar valores para realizar a geração da senha.

A seguir, na Imagem 1, mais detalhes do código do analisador léxico.

Imagem 1 - Estrutura do analisador léxico (Scanner.flex).

Fonte: (AUTORES, 2023).

# 6. Gramática Formal

  Como desenvolvemos uma aplicação para gerar logins e senhas, acabamos por não utilizar regras, e sim grande parte da implementação na linguagem java, que é chamada pelo parser, e após receber os dados do usuário, envia para o analisador léxico.

ParserLogin (APÊNDICE A) = Utiliza o Scanner (Imagem 1) para validar os tokens de entrada para realizar a geração do login.
ParserPassword (APÊNDICE B) = Utiliza o Scanner (Imagem 1) para validar os tokens de entrada para realizar a geração da senha.

Senhas geralmente seguem padrões ou possuem algumas restrições, desta forma, utilizamos a gramática formal para definir a estrutura das senhas, entretanto, a ordem é algo comprometedor, manter um padrão exato de senhas acaba deixando-as vulneráveis e assim facilitando para pessoas más intencionadas invadirem e roubarem os dados, pensando nisso, elaboramos diversas combinações para contornar este problema, abaixo as variações definidas para login e senha.

## Senha:

Variação 1:  (1º caractere do nome minúsculo) + (1º caractere sobrenome maiúsculo) + (sobrenome minúsculo)

Variação 2: (sobrenome minúsculo) + (1º caractere do nome maiúsculo) + (1º caractere do nome maiúsculo)

Variação 3: (Quantidade aleatória de caracteres do setor/InfoSite maiúscula) + (1º caractere nome minúsculo)

Variação 4: (Quantidade aleatória de caracteres do setor/InfoSite maiúscula) + (sobrenome em minusculo)

Variação 5: (nome em minúsculo) + (1º caractere do setor em minúsculo)

Variação 6: (sobrenome em minúsculo) + (1º caractere setor em minúsculo)


## Login:

Variação 1: (1º caractere nome em minusculo) + (sobrenome em maiúsculo) + (setor em maiúsculas) + (quantidade aleatória de caracteres da data de nascimento)

Variação 2: (nome em minúsculo) + (1º carácter do setor em maiúsculo) + (valor aleatório de caracteres da data de nascimento)

Variação 3: (1º caractere do nome em maiúsculo) + (setor em minúsculo) + ( sobrenome em maiúsculo) + (valor aleatório de caracteres da data de nascimento)

Variação 4: (nome em minusculo) + (setor em minúsculo) + (1 caractere do sobrenome em maiúsculo)

Variação 5: (setor em minúsculo) + (1º caractere do nome em minusculo) + (sobrenome em maiúsculo) + (quantidade de caracteres aleatórias da data de nascimento)

Variação 6: (setor em maiúsculas) + (nome em minusculo) + (1º caractere sobrenome em maiúsculo) + (quantidade de caracteres aleatórias da data de nascimento) 

Desta forma, o usuário tem informações pertinentes do seu cotidiano, mas sem ter aquele famoso padrão que é utilizado na mesma senha diversas vezes.


# 7. Expressões Regulares

Utilizamos no desenvolvimento do nosso projeto as expressões regulares para determinar, por exemplo, os filtros de validação da senha, como tamanho, quantidade de caracteres especiais, números, etc.

# 8. Interface

Embora não seja um requisito, desenvolvemos uma interface para aprimoramento do projeto, onde foi desenvolvido uma identidade visual, contendo símbolo, nome do projeto, ícone e background.
Possui uma tela Inicial, onde o usuário pode se munir de informações ou iniciar a ferramenta, conforme a figura do lado esquerdo, da Imagem 2, e quando iniciado o programa, é apresentado ao usuário uma tela com os campos para inserção dos dados, botão de geração e dois campos destinados a aparecer os logins e as senhas gerados pelo sistema, conforme figura da direita, da Imagem 2.

Imagem 2 - Tela inicial e tela de aplicação

Fonte: (AUTORES, 2023)

Ao clicar no ícone de pergunta, aparece na tela um campo explicando sobre o trabalho, o nome dos integrantes, o número do grupo e ideia proposta, na figura da esquerda da Imagem 3, e, na tela de geração de logins e senhas, o campo é munido com o passo a passo do funcionamento da ferramenta, conforme figura da direita, da Imagem 3.

Imagem 3 - Campo de ajuda (?) das telas desenvolvidas.

Fonte: (AUTORES, 2023)

Caso o usuário deixe de inserir algum dos dados requisitados, o sistema notifica o mesmo sobre valores faltando ou inseridos de forma incorreta, e só funcionará quando os valores forem ajustados.

Imagem 4 - Tela de aviso de valores faltando ou inseridos de forma incorreta.

Fonte: (AUTORES, 2023).

# 9. Exemplos de Uso

	Abaixo temos alguns exemplos do funcionamento da ferramenta(Imagem 5, Imagem 6 e Imagem 7, os dados inseridos e o resultado obtido após a geração do login e senha.
Imagem 5 - Funcionamento do sistema.

Fonte: (AUTORES, 2023).
Imagem 6 - Funcionamento do Sistema

Fonte: (AUTORES, 2023).

Imagem 7 - Funcionamento do Sistema juntamente com o Terminal

Fonte: (AUTORES, 2023).

# 10. Conclusão

Mesmo enfrentando algumas limitações, o sistema atende à sua proposta inicial. O uso dos analisadores em si já serve como um obstáculo natural para a aplicação, sendo um desafio para os membros do grupo, no entanto, conseguimos criar uma ferramenta funcional e intuitiva.

# Apêndice A - ParserLogin.cup

package br.com.unisc.project.backend;
import java_cup.runtime.*;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import br.com.unisc.project.backend.Scanner;
import java_cup.runtime.Symbol;
import java_cup.runtime.XMLElement;

parserPassword code {:
     private List<Object> valores = new ArrayList<>();
      private String nome;
      private String sobrenome;
      private String dataNascimento;
      private String setor;

      public void end() {
          System.out.println("Fim do Fluxo!");
      }

      public String getNome(List<Object> o) {
          String name = o.get(0).toString();
          o.remove(0);
          o.remove(0);
          return name;
      }

      public String getSobrenome(List<Object> o) {
          String sobrenome = o.get(0).toString();
          o.remove(0);
          o.remove(0);
          return sobrenome;
      }

      public String getSetor(List<Object> o) {
          String setor = o.get(0).toString();
          o.remove(0);
          o.remove(0);
          return setor;
      }

      public String getDataNascimento(List<Object> o) {
          return o.toString().replace("[", "").replace("]", "");
      }

      private void salvarValor(List<String> values) {
          try {
              // Cria um objeto FileWriter para escrever no arquivo
              FileWriter fileWriter = new FileWriter("src/main/java/br/com/unisc/project/backend/files/LoginGenereted");

              // Cria um objeto BufferedWriter para escrever de forma mais eficiente
              BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

              // Itera sobre a lista e escreve cada string em uma nova linha
              for (String value : values) {
                  bufferedWriter.write(value);
                  bufferedWriter.newLine(); // Adiciona uma quebra de linha após cada string
              }

              // Fecha os recursos para liberar os recursos do sistema
              bufferedWriter.close();
              fileWriter.close();

              System.out.println("As informações foram salvas no arquivo com sucesso.");

          } catch (IOException e) {
              e.printStackTrace();
          }
      }

      private String gerarLogin(String nome, String sobrenome, String setor, String dataNascimentoStr) {
          // Geração de valor aleatório
          Random random = new Random();

          // Criar variações para a parte inicial da Senha
          String variacao1 = nome.substring(0, 1).toLowerCase() + sobrenome.toUpperCase() + setor.toUpperCase() + dataNascimentoStr.substring(random.nextInt(0, 4), random.nextInt(3, 7));
          String variacao2 = nome.toLowerCase() + sobrenome.substring(0, 1).toLowerCase() + setor.toLowerCase() + dataNascimentoStr.substring(random.nextInt(0, 4), random.nextInt(3, 7));
          String variacao3 = nome.substring(0, 1).toUpperCase() + setor.toLowerCase() + sobrenome.toLowerCase() + dataNascimentoStr.substring(random.nextInt(0, 4), random.nextInt(3, 7));
          String variacao4 = nome.toLowerCase() + setor.toLowerCase() + sobrenome.substring(0, 1).toUpperCase() + dataNascimentoStr.substring(random.nextInt(0, 4), random.nextInt(3, 7));
          String variacao5 = setor.toLowerCase() + nome.substring(0, 1).toLowerCase() + sobrenome.toLowerCase() + dataNascimentoStr.substring(random.nextInt(0, 4), random.nextInt(3, 7));
          String variacao6 = setor.toUpperCase() + nome.toLowerCase() + sobrenome.substring(0, 1).toUpperCase() + dataNascimentoStr.substring(random.nextInt(0, 4), random.nextInt(3, 7));

          // Escolher aleatoriamente uma variação
          int escolhaVariacao = random.nextInt(6); // Escolher aleatoriamente entre as 6 variações

          String variacaoEscolhida;
          switch (escolhaVariacao) {
              case 0:
                  variacaoEscolhida = variacao1;
                  break;
              case 1:
                  variacaoEscolhida = variacao2;
                  break;
              case 2:
                  variacaoEscolhida = variacao3;
                  break;
              case 3:
                  variacaoEscolhida = variacao4;
                  break;
              case 4:
                  variacaoEscolhida = variacao5;
                  break;
              case 5:
                  variacaoEscolhida = variacao6;
                  break;
              default:
                  variacaoEscolhida = variacao1;
          }

          return variacaoEscolhida;

      }

      Scanner s;

      ParserLogin(Scanner s) throws java.lang.Exception {
          this.s = s;


          Symbol symbol = s.next_token();
          while (symbol.sym != Tokens.EOF) {
              valores.add(symbol.value);
              System.out.printf("<%d, %s>\n", symbol.sym, symbol.value);
              symbol = s.next_token();
          }
          nome = getNome(valores);
          sobrenome = getSobrenome(valores);
          setor = getSetor(valores);
          dataNascimento = getDataNascimento(valores);

          List<String> logins = new ArrayList<>();


          for (int i = 0; i < 6; i++) {
              String login = gerarLogin(nome, sobrenome, setor, dataNascimento);
              logins.add(login);
          }

          salvarValor(logins);

      }

:}

/* conectar esse parserPassword ao scanner! */
init with {:  :};
scan with {: return s.next_token(); :};

terminal            LETRA, ESPECIAL;
terminal Integer    NUMERO;

non terminal            fim;

fim ::=   {:           end();         :}
;


# Apêndice B - ParserPassword.cup

package br.com.unisc.project.backend;
import java_cup.runtime.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import java_cup.runtime.Symbol;

parserPassword code{:
 private List<Object> valores = new ArrayList<>();
    private String nome;
    private String sobrenome;
    private String dataNascimento;
    private String setor;

    public void end() {
        System.out.println("Fim do Fluxo!");
    }

    public String getNome(List<Object> o) {
        String name = o.get(0).toString();
        o.remove(0);
        o.remove(0);
        return name;
    }

    public String getSobrenome(List<Object> o) {
        String sobrenome = o.get(0).toString();
        o.remove(0);
        o.remove(0);
        return sobrenome;
    }

    public String getSetor(List<Object> o) {
        String setor = o.get(0).toString();
        o.remove(0);
        o.remove(0);
        return setor;
    }

    public String getDataNascimento(List<Object> o) {
        return o.toString().replace("[", "").replace("]", "");
    }

    private String gerarSenha(String nome, String sobrenome, String setor, String dataNascimentoStr) {
        // Geração de valor aleatório
        String valorAleatorio = gerarValorAleatorio();
        Random random = new Random();

        // Formatar a data de nascimento
        SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
        Date dataNascimento;
        try {
            dataNascimento = dateFormat.parse(dataNascimentoStr.replace("/", ""));
        } catch (Exception e) {
            throw new RuntimeException("Erro ao converter a data de nascimento.", e);
        }

        // Criar variações para a parte inicial da Senha
        String variacao1 = nome.substring(0, 1).toLowerCase() + sobrenome.substring(0, 1).toUpperCase() + sobrenome.toLowerCase();
        String variacao2 = sobrenome.toLowerCase() + nome.substring(0, 1).toUpperCase();
        String variacao3 = setor.substring(0, random.nextInt(0, setor.length())).toUpperCase() + nome.substring(0, 1).toLowerCase();
        String variacao4 = setor.substring(0, random.nextInt(0, setor.length())).toUpperCase() + sobrenome.toLowerCase();
        String variacao5 = nome.toLowerCase() + setor.toLowerCase().substring(0, 1);
        String variacao6 = sobrenome.toLowerCase() + setor.toLowerCase().substring(0, 1);

        // Escolher aleatoriamente uma variação
        int escolhaVariacao = random.nextInt(6); // Escolher aleatoriamente entre as 6 variações

        String variacaoEscolhida;
        switch (escolhaVariacao) {
            case 0:
                variacaoEscolhida = variacao1;
                break;
            case 1:
                variacaoEscolhida = variacao2;
                break;
            case 2:
                variacaoEscolhida = variacao3;
                break;
            case 3:
                variacaoEscolhida = variacao4;
                break;
            case 4:
                variacaoEscolhida = variacao5;
                break;
            case 5:
                variacaoEscolhida = variacao6;
                break;
            default:
                variacaoEscolhida = variacao1;
        }

        // Criar a combinando as informações
        String password = variacaoEscolhida +
                setor.substring(0, 1).toUpperCase() + getSpecialValue() + valorAleatorio
                + dateFormat.format(dataNascimento).toString().substring(random.nextInt(0, 4), random.nextInt(3, 7));

        return password;
    }

    private String getSpecialValue() {
        String values = "[!@#%&*(-_=~`}<>,.?]";
        int pos = values.length();
        Random random = new Random();
        int valor = random.nextInt(random.nextInt(1, pos));
        String special = values.substring(valor, valor + 1);
        return special;
    }

    private String gerarValorAleatorio() {
        // Geração de valor aleatório usando a classe Random
        Random random = new Random();
        int valorAleatorio = random.nextInt(1000); // Valor aleatório entre 0 e 999
        return String.format("%03d", valorAleatorio); // Formatar para garantir três dígitos
    }

    private void salvarValor(List<String> values) {
        try {
            // Cria um objeto FileWriter para escrever no arquivo
            FileWriter fileWriter = new FileWriter("src/main/java/br/com/unisc/project/backend/files/PasswordGenereted");

            // Cria um objeto BufferedWriter para escrever de forma mais eficiente
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Itera sobre a lista e escreve cada string em uma nova linha
            for (String value : values) {
                bufferedWriter.write(value);
                bufferedWriter.newLine(); // Adiciona uma quebra de linha após cada string
            }

            // Fecha os recursos para liberar os recursos do sistema
            bufferedWriter.close();
            fileWriter.close();

            System.out.println("As informações foram salvas no arquivo com sucesso.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    Scanner s;

    ParserPassword(Scanner s) throws java.lang.Exception {
        this.s = s;


        Symbol symbol = s.next_token();
        while (symbol.sym != Tokens.EOF) {
            valores.add(symbol.value);
            System.out.printf("<%d, %s>\n", symbol.sym, symbol.value);
            symbol = s.next_token();
        }

        nome = getNome(valores);
        sobrenome = getSobrenome(valores);
        setor = getSetor(valores);
        dataNascimento = getDataNascimento(valores);

        List<String> passwords = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String password = gerarSenha(nome, sobrenome, setor, dataNascimento);
            passwords.add(password);
        }

        salvarValor(passwords);
    }
:}

/* conectar esse parserPassword ao scanner! */
init with {:  :};
scan with {: return s.next_token(); :};

terminal            LETRA, ESPECIAL;
terminal Integer    NUMERO;

non terminal            fim;

fim ::=   {:           end();         :}
;



