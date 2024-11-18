/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexico;

/**
 *
 * @author Math Pedroza & André Labanca
 */
public enum Token {
        numero, letra, relacional, oparitmetico, comentario, tipos, final_linha, criar_classe, 
        final_linha_classe, relacionamento, parametros, retorno, atributos_visibilidade, 
        associacoes_atributos, propriedades_operacoes, relacionamentos_classes, criar_chaves_fk, 
        opcoes_fk, multiplicidade, navegabilidade,criar_relacao, criar_op, shape,relationship, 
        delete, abre_colchete, fecha_colchete, abre_parenteses, fecha_parenteses, on_delete, on_update,
        format, concurrent, update, variavel, constante, virgula, func, define_const, number_relationship,
        para, enquanto, classe, enquanto_for, abre_chave, fecha_chave, ERROR, quebra_linha, espaco,atribuicao_func,
        atribuicao_classe, inicio_funcao, criacao_de_classe, atributos_da_classe, tipo_atributo, criar_metodo, ler_metodo,
        alterar_metodo, excluir_metodo, retorno_metodo, se, senao
    
}
