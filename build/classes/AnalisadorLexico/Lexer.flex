package AnalisadorLexico;
import static AnalisadorLexico.Token.*;

%%
%class Lexer
%type Token

letras = [a-zA-Z]
D=[0-9]+

WHITE = [ ,\t,\r]+
%{
    public String lexeme;
%}
%%

{WHITE} /*Ignore*/

/* Números */

("(-"{D}+")")|{D}+ {lexeme=yytext(); return numero;}

{letras} {lexeme = yytext(); return letra;}

/* Operadores relacionais */

("<")      {lexeme = yytext(); return relacional;}
(">")      {lexeme = yytext(); return relacional;}
("=")      {lexeme = yytext(); return relacional;}
("<=")    {lexeme = yytext(); return relacional;}
(">=")    {lexeme = yytext(); return relacional;}
("!=")     {lexeme = yytext(); return relacional;}

/* Operadores aritmeticos */

("+")      {lexeme = yytext(); return oparitmetico;}
("-")      {lexeme = yytext(); return oparitmetico;}
("*")      {lexeme = yytext(); return oparitmetico;}
("/")      {lexeme = yytext(); return oparitmetico;}

/* Atribuições */

("=>")  {lexeme = yytext(); return atribuicao_func;}
("<-")  {lexeme = yytext(); return atribuicao_classe;}
("->")  {lexeme = yytext(); return criacao_de_classe;}
{letras}_{letras} {lexeme = yytext(); return atributos_da_classe;}

/* Comentarios */
( "&&"(.)* ) {/*Ignore*/}

/* Tipos */

("INT")         {lexeme = yytext(); return tipos;}
("CHAR")        {lexeme = yytext(); return tipos;}
("VARCHAR")     {lexeme = yytext(); return tipos;}
("DOUBLE")      {lexeme = yytext(); return tipos;}
("REAL")        {lexeme = yytext(); return tipos;}
("FLOAT")       {lexeme = yytext(); return tipos;}
("DATE")        {lexeme = yytext(); return tipos;}
("DATETIME")    {lexeme = yytext(); return tipos;}
("DECIMAL")     {lexeme = yytext(); return tipos;}

/* Separadores */

("/;")         {lexeme = yytext(); return final_linha;}
(";;;")        {lexeme = yytext(); return final_linha_classe;}
(",")          {lexeme = yytext(); return virgula;}
("(")          {lexeme = yytext(); return abre_parenteses;}
(")")          {lexeme = yytext(); return fecha_parenteses;}
("[")          {lexeme = yytext(); return abre_colchete;}
("]")          {lexeme = yytext(); return fecha_colchete;}
("{")          {lexeme = yytext(); return abre_chave;}
("}")          {lexeme = yytext(); return fecha_chave;}
(":")          {lexeme = yytext(); return inicio_funcao;} 
("::")         {lexeme = yytext(); return tipo_atributo;} 
(":::")        {lexeme = yytext(); return retorno_metodo;} 

/* Palavras reservadas */

("Relantionship")       {lexeme = yytext(); return relationship;}
("Delete")              {lexeme = yytext(); return excluir_metodo;}
("OnDelete")            {lexeme = yytext(); return on_delete;}
("OnUpdate")            {lexeme = yytext(); return on_update;}
("Format")              {lexeme = yytext(); return format;}
("Classe")              {lexeme = yytext(); return classe;}
("Concurrent")          {lexeme = yytext(); return concurrent;}
("Update")              {lexeme = yytext(); return alterar_metodo;}
("DefineConst")         {lexeme = yytext(); return define_const;}
("NumberRelationship")  {lexeme = yytext(); return number_relationship;}
("For")                 {lexeme = yytext(); return para;}
("While")               {lexeme = yytext(); return enquanto;}
("DoWhile")             {lexeme = yytext(); return enquanto_for;}
("If")                  {lexeme = yytext(); return se;}
("Else")                {lexeme = yytext(); return senao;}
("Creat")               {lexeme = yytext(); return criar_metodo;}
("Read")                {lexeme = yytext(); return ler_metodo;}

/* Retornos */

("Boolean")        {lexeme = yytext(); return retorno;}
("Void")           {lexeme = yytext(); return retorno;}
("Double")         {lexeme = yytext(); return retorno;}
("Int")            {lexeme = yytext(); return retorno;}
("Float")          {lexeme = yytext(); return retorno;}
("String")         {lexeme = yytext(); return retorno;}
("Return")         {lexeme = yytext(); return retorno;}

/* Atributos de Visibilidade */

("Protected")        {lexeme = yytext(); return atributos_visibilidade;}
("Public")           {lexeme = yytext(); return atributos_visibilidade;}
("Private")          {lexeme = yytext(); return atributos_visibilidade;}
("Package")          {lexeme = yytext(); return atributos_visibilidade;}

/* Associações de Atributos */

("ReadOnly")           {lexeme = yytext(); return associacoes_atributos;}
("Unique")             {lexeme = yytext(); return associacoes_atributos;}
("NonUnique")          {lexeme = yytext(); return associacoes_atributos;}
("Ordered")            {lexeme = yytext(); return associacoes_atributos;}
("Unordered")          {lexeme = yytext(); return associacoes_atributos;}
("AutoIncrement")      {lexeme = yytext(); return associacoes_atributos;}
("NotNull")            {lexeme = yytext(); return associacoes_atributos;}

/* Propriedades de Operações */

("Query")          {lexeme = yytext(); return propriedades_operacoes;}
("Guarded")        {lexeme = yytext(); return propriedades_operacoes;}

/* Formas */

("Rectangular")   {lexeme = yytext(); return shape;}
("Square")        {lexeme = yytext(); return shape;}
("Circle")        {lexeme = yytext(); return shape;}
("Triangle")      {lexeme = yytext(); return shape;}

/* Navegabilidade */

("RightToLeft")   {lexeme = yytext(); return navegabilidade;}
("LeftToRight")   {lexeme = yytext(); return navegabilidade;}

/* Opções de Chaves */

("Cascade")         {lexeme = yytext(); return opcoes_fk;}
("Restricted")      {lexeme = yytext(); return opcoes_fk;}
("SetNull")         {lexeme = yytext(); return opcoes_fk;}
("NoAction")        {lexeme = yytext(); return opcoes_fk;}

/* Relacionamentos */

("1&1")               {lexeme = yytext(); return relacionamento;}
("1&M")               {lexeme = yytext(); return relacionamento;}
("M&M")               {lexeme = yytext(); return relacionamento;}
("Hierarquia")        {lexeme = yytext(); return relacionamentos_classes;}
("Agregação")         {lexeme = yytext(); return relacionamentos_classes;}
("Generalização")     {lexeme = yytext(); return relacionamentos_classes;}

/* Função */

("Func") {lexeme = yytext(); return func;}

/* Variáveis */

("[a-zA-Z][0-9]") {lexeme = yytext(); return variavel;} 

/* Constantes */

("[A-Z]*[0-9]") {lexeme = yytext(); return constante;}


/* Multiplicidade */

("[0-9]") {lexeme = yytext(); return multiplicidade;}

/* Quebra de Linha */

("\\q") {lexeme = yytext(); return quebra_linha;}
("\n")  {lexeme = yytext(); return quebra_linha;}
(" ")   {lexeme = yytext(); return espaco;}

. {return ERROR;}