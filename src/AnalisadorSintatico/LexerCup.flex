package AnalisadorSintatico;

import static AnalisadorLexico.Token.*;
import java_cup.runtime.Symbol;
import AnalisadorSintatico.sym;

%%

//%public
%class Yylex // cria a classe Yylex.java
%type java_cup.runtime.Symbol //  especifica o tipo de retorno dos tokens quando identificados.
%cup // analisador sera integrado a biblioteca JavaCup
%full // extende o alfabeto com todos os valores de 8 bits
%line // agrega a variável int yyline para indicar a linha do lexema
%char // agrega a variável int yychar, indica o índice do primeiro carater do lexema
%eofval{
    return new Symbol (sym.EOF, new String("Fim do arquivo")); // específica um valor de retorno ao final do arquivo
%eofval}

espaco = \t|\f|" "|\r|\n
letras = [A-Z]
D = [0-9]
%{
    public String lexeme;
%}
%%

{espaco} {/*Igonore*/}

/* Comentarios */
( "&&"(.)* ) {/*Ignore*/}

/* Números */

("(-"{D}+")")|{D}+ {return new Symbol(sym.numero, yychar, yyline, yytext());}

{letras} {return new Symbol(sym.letra, yychar, yyline, yytext());}

/* Operadores relacionais */

("<")      {return new Symbol(sym.relacional, yychar, yyline, yytext());}
(">")      {return new Symbol(sym.relacional, yychar, yyline, yytext());}
("=")      {return new Symbol(sym.relacional, yychar, yyline, yytext());}
("<=")    {return new Symbol(sym.relacional, yychar, yyline, yytext());}
(">=")    {return new Symbol(sym.relacional, yychar, yyline, yytext());}
("!=")     {return new Symbol(sym.relacional, yychar, yyline, yytext());}

/* Operadores aritmeticos */

("+")      {return new Symbol(sym.oparitmetico, yychar, yyline, yytext());}
("-")      {return new Symbol(sym.oparitmetico, yychar, yyline, yytext());}
("*")      {return new Symbol(sym.oparitmetico, yychar, yyline, yytext());}
("/")      {return new Symbol(sym.oparitmetico, yychar, yyline, yytext());}

/* Atribuições */

("=>")   {return new Symbol(sym.atribuicao_func, yychar, yyline, yytext());}
("<-")   {return new Symbol(sym.atribuicao_classe, yychar, yyline, yytext());}
("->")   {return new Symbol(sym.criacao_de_classe, yychar, yyline, yytext());}
{letras}_{letras}  {return new Symbol(sym.atributos_da_classe, yychar, yyline, yytext());}

/* Tipos */

("INT")         {return new Symbol(sym.tipos, yychar, yyline, yytext());}
("CHAR")        {return new Symbol(sym.tipos, yychar, yyline, yytext());}
("VARCHAR")     {return new Symbol(sym.tipos, yychar, yyline, yytext());}
("DOUBLE")      {return new Symbol(sym.tipos, yychar, yyline, yytext());}
("REAL")        {return new Symbol(sym.tipos, yychar, yyline, yytext());}
("FLOAT")       {return new Symbol(sym.tipos, yychar, yyline, yytext());}
("DATE")        {return new Symbol(sym.tipos, yychar, yyline, yytext());}
("DATETIME")    {return new Symbol(sym.tipos, yychar, yyline, yytext());}
("DECIMAL")     {return new Symbol(sym.tipos, yychar, yyline, yytext());}

/* Separadores */

("/;")        {return new Symbol(sym.final_linha, yychar, yyline, yytext());}
(";;;")       {return new Symbol(sym.final_linha_classe, yychar, yyline, yytext());}
(",")         {return new Symbol(sym.virgula, yychar, yyline, yytext());}
("(")         {return new Symbol(sym.abre_parenteses, yychar, yyline, yytext());}
(")")         {return new Symbol(sym.fecha_parenteses, yychar, yyline, yytext());}
("[")         {return new Symbol(sym.abre_colchete, yychar, yyline, yytext());}
("]")         {return new Symbol(sym.fecha_colchete, yychar, yyline, yytext());}
("{")         {return new Symbol(sym.abre_chave, yychar, yyline, yytext());}
("}")         {return new Symbol(sym.fecha_chave, yychar, yyline, yytext());}
(":")         {return new Symbol(sym.inicio_funcao, yychar, yyline, yytext());}
("::")        {return new Symbol(sym.tipo_atributo, yychar, yyline, yytext());}
(":::")       {return new Symbol(sym.retorno_metodo, yychar, yyline, yytext());}

/* Palavras reservadas */

("Relantionship")        {return new Symbol(sym.relationship, yychar, yyline, yytext());}
("Delete")               {return new Symbol(sym.excluir_metodo, yychar, yyline, yytext());}
("OnDelete")             {return new Symbol(sym.on_delete, yychar, yyline, yytext());}
("OnUpdate")             {return new Symbol(sym.on_update, yychar, yyline, yytext());}
("Format")               {return new Symbol(sym.format, yychar, yyline, yytext());}
("Classe")               {return new Symbol(sym.classe, yychar, yyline, yytext());}
("Concurrent")           {return new Symbol(sym.concurrent, yychar, yyline, yytext());}
("Update")               {return new Symbol(sym.alterar_metodo, yychar, yyline, yytext());}
("DefineConst")          {return new Symbol(sym.define_const, yychar, yyline, yytext());}
("NumberRelationship")   {return new Symbol(sym.number_relationship, yychar, yyline, yytext());}
("For")                  {return new Symbol(sym.para, yychar, yyline, yytext());}
("While")                {return new Symbol(sym.enquanto, yychar, yyline, yytext());}
("DoWhile")              {return new Symbol(sym.enquanto_for, yychar, yyline, yytext());}
("Creat")                {return new Symbol(sym.criar_metodo, yychar, yyline, yytext());}
("Read")                 {return new Symbol(sym.ler_metodo, yychar, yyline, yytext());}

/* Retornos */

("Boolean")        {return new Symbol(sym.retorno, yychar, yyline, yytext());}
("Void")           {return new Symbol(sym.retorno, yychar, yyline, yytext());}
("Double")         {return new Symbol(sym.retorno, yychar, yyline, yytext());}
("Int")            {return new Symbol(sym.retorno, yychar, yyline, yytext());}
("Float")          {return new Symbol(sym.retorno, yychar, yyline, yytext());}
("String")         {return new Symbol(sym.retorno, yychar, yyline, yytext());}
("Return")         {return new Symbol(sym.retorno, yychar, yyline, yytext());}

/* Atributos de Visibilidade */

("Protected")        {return new Symbol(sym.atributos_visibilidade, yychar, yyline, yytext());}
("Public")           {return new Symbol(sym.atributos_visibilidade, yychar, yyline, yytext());}
("Private")          {return new Symbol(sym.atributos_visibilidade, yychar, yyline, yytext());}
("Package")          {return new Symbol(sym.atributos_visibilidade, yychar, yyline, yytext());}

/* Associações de Atributos */

("ReadOnly")           {return new Symbol(sym.associacoes_atributos, yychar, yyline, yytext());}
("Unique")             {return new Symbol(sym.associacoes_atributos, yychar, yyline, yytext());}
("NonUnique")          {return new Symbol(sym.associacoes_atributos, yychar, yyline, yytext());}
("Ordered")            {return new Symbol(sym.associacoes_atributos, yychar, yyline, yytext());}
("Unordered")          {return new Symbol(sym.associacoes_atributos, yychar, yyline, yytext());}
("AutoIncrement")      {return new Symbol(sym.associacoes_atributos, yychar, yyline, yytext());}
("NotNull")            {return new Symbol(sym.associacoes_atributos, yychar, yyline, yytext());}

/* Propriedades de Operações */

("Query")          {return new Symbol(sym.propriedade_operacoes, yychar, yyline, yytext());}
("Guarded")        {return new Symbol(sym.propriedade_operacoes, yychar, yyline, yytext());}

/* Formas */

("Rectangular")   {return new Symbol(sym.shape, yychar, yyline, yytext());}
("Square")        {return new Symbol(sym.shape, yychar, yyline, yytext());}
("Circle")        {return new Symbol(sym.shape, yychar, yyline, yytext());}
("Triangle")      {return new Symbol(sym.shape, yychar, yyline, yytext());}

/* Navegabilidade */

("RightToLeft")   {return new Symbol(sym.navegabilidade, yychar, yyline, yytext());}
("LeftToRight")   {return new Symbol(sym.navegabilidade, yychar, yyline, yytext());}

/* Opções de Chaves */

("Cascade")         ("LeftToRight")   {return new Symbol(sym.opcoes_fk, yychar, yyline, yytext());}
("Restricted")      ("LeftToRight")   {return new Symbol(sym.opcoes_fk, yychar, yyline, yytext());}
("SetNull")         ("LeftToRight")   {return new Symbol(sym.opcoes_fk, yychar, yyline, yytext());}
("NoAction")        ("LeftToRight")   {return new Symbol(sym.opcoes_fk, yychar, yyline, yytext());}

/* Relacionamentos */

("1&1")               ("LeftToRight")   {return new Symbol(sym.relacionamento, yychar, yyline, yytext());}
("1&M")               ("LeftToRight")   {return new Symbol(sym.relacionamento, yychar, yyline, yytext());}
("M&M")               ("LeftToRight")   {return new Symbol(sym.relacionamento, yychar, yyline, yytext());}
("Hierarquia")        ("LeftToRight")   {return new Symbol(sym.relacionamentos_classes, yychar, yyline, yytext());}
("Agregação")         ("LeftToRight")   {return new Symbol(sym.relacionamentos_classes, yychar, yyline, yytext());}
("Generalização")     ("LeftToRight")   {return new Symbol(sym.relacionamentos_classes, yychar, yyline, yytext());}

/* Função */

("Func") {return new Symbol(sym.func, yychar, yyline, yytext());}

/* Variáveis */

("[A-Z]*[0-9]") {return new Symbol(sym.variavel, yychar, yyline, yytext());}

/* Constantes */

("[A-Z]*[0-9]") {return new Symbol(sym.constante, yychar, yyline, yytext());}

/* Multiplicidade */

("[0-9]") {return new Symbol(sym.multiplicidade, yychar, yyline, yytext());}

/* Quebra de Linha */

("\\q") {return new Symbol(sym.quebra_linha, yychar, yyline, yytext());}
("\n")  {return new Symbol(sym.quebra_linha, yychar, yyline, yytext());}
(" ")   {return new Symbol(sym.espaco, yychar, yyline, yytext());}

 . {System.err.println("Caracter ilegal: " +yytext());}