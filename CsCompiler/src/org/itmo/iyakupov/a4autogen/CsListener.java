// Generated from /home/ilia/Compiler2014/Cs.g4 by ANTLR 4.3
package org.itmo.iyakupov.a4autogen;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CsParser}.
 */
public interface CsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CsParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterInclusive_or_expression(@NotNull CsParser.Inclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitInclusive_or_expression(@NotNull CsParser.Inclusive_or_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#assign_and_modify_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssign_and_modify_operator(@NotNull CsParser.Assign_and_modify_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#assign_and_modify_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssign_and_modify_operator(@NotNull CsParser.Assign_and_modify_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_expression(@NotNull CsParser.Assignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_expression(@NotNull CsParser.Assignment_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#parameter_type_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_type_list(@NotNull CsParser.Parameter_type_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#parameter_type_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_type_list(@NotNull CsParser.Parameter_type_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#equality_operator}.
	 * @param ctx the parse tree
	 */
	void enterEquality_operator(@NotNull CsParser.Equality_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#equality_operator}.
	 * @param ctx the parse tree
	 */
	void exitEquality_operator(@NotNull CsParser.Equality_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expression(@NotNull CsParser.Multiplicative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expression(@NotNull CsParser.Multiplicative_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void enterJump_statement(@NotNull CsParser.Jump_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitJump_statement(@NotNull CsParser.Jump_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompound_statement(@NotNull CsParser.Compound_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompound_statement(@NotNull CsParser.Compound_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(@NotNull CsParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(@NotNull CsParser.Relational_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#enum_specifier}.
	 * @param ctx the parse tree
	 */
	void enterEnum_specifier(@NotNull CsParser.Enum_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#enum_specifier}.
	 * @param ctx the parse tree
	 */
	void exitEnum_specifier(@NotNull CsParser.Enum_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterParameter_declaration(@NotNull CsParser.Parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitParameter_declaration(@NotNull CsParser.Parameter_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#declaration_specifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_specifier(@NotNull CsParser.Declaration_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#declaration_specifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_specifier(@NotNull CsParser.Declaration_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_expression(@NotNull CsParser.Postfix_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_expression(@NotNull CsParser.Postfix_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(@NotNull CsParser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(@NotNull CsParser.Equality_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(@NotNull CsParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(@NotNull CsParser.Assignment_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#arg_suffix}.
	 * @param ctx the parse tree
	 */
	void enterArg_suffix(@NotNull CsParser.Arg_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#arg_suffix}.
	 * @param ctx the parse tree
	 */
	void exitArg_suffix(@NotNull CsParser.Arg_suffixContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(@NotNull CsParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(@NotNull CsParser.EnumeratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(@NotNull CsParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(@NotNull CsParser.Unary_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#arr_suffix}.
	 * @param ctx the parse tree
	 */
	void enterArr_suffix(@NotNull CsParser.Arr_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#arr_suffix}.
	 * @param ctx the parse tree
	 */
	void exitArr_suffix(@NotNull CsParser.Arr_suffixContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#arr_arg_suffix}.
	 * @param ctx the parse tree
	 */
	void enterArr_arg_suffix(@NotNull CsParser.Arr_arg_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#arr_arg_suffix}.
	 * @param ctx the parse tree
	 */
	void exitArr_arg_suffix(@NotNull CsParser.Arr_arg_suffixContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#cls_method}.
	 * @param ctx the parse tree
	 */
	void enterCls_method(@NotNull CsParser.Cls_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#cls_method}.
	 * @param ctx the parse tree
	 */
	void exitCls_method(@NotNull CsParser.Cls_methodContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull CsParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull CsParser.ConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull CsParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull CsParser.DeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#init_declarator_list}.
	 * @param ctx the parse tree
	 */
	void enterInit_declarator_list(@NotNull CsParser.Init_declarator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#init_declarator_list}.
	 * @param ctx the parse tree
	 */
	void exitInit_declarator_list(@NotNull CsParser.Init_declarator_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelection_statement(@NotNull CsParser.Selection_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelection_statement(@NotNull CsParser.Selection_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpression_statement(@NotNull CsParser.Expression_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpression_statement(@NotNull CsParser.Expression_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void enterInit_declarator(@NotNull CsParser.Init_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void exitInit_declarator(@NotNull CsParser.Init_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#cls_def}.
	 * @param ctx the parse tree
	 */
	void enterCls_def(@NotNull CsParser.Cls_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#cls_def}.
	 * @param ctx the parse tree
	 */
	void exitCls_def(@NotNull CsParser.Cls_defContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_list(@NotNull CsParser.Identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_list(@NotNull CsParser.Identifier_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#shift_operator}.
	 * @param ctx the parse tree
	 */
	void enterShift_operator(@NotNull CsParser.Shift_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#shift_operator}.
	 * @param ctx the parse tree
	 */
	void exitShift_operator(@NotNull CsParser.Shift_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#comparsion_operator}.
	 * @param ctx the parse tree
	 */
	void enterComparsion_operator(@NotNull CsParser.Comparsion_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#comparsion_operator}.
	 * @param ctx the parse tree
	 */
	void exitComparsion_operator(@NotNull CsParser.Comparsion_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterExclusive_or_expression(@NotNull CsParser.Exclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitExclusive_or_expression(@NotNull CsParser.Exclusive_or_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#enumerator_list}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator_list(@NotNull CsParser.Enumerator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#enumerator_list}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator_list(@NotNull CsParser.Enumerator_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull CsParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull CsParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_and_expression(@NotNull CsParser.Logical_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_and_expression(@NotNull CsParser.Logical_and_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(@NotNull CsParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(@NotNull CsParser.Additive_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(@NotNull CsParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(@NotNull CsParser.Unary_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expression(@NotNull CsParser.Conditional_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expression(@NotNull CsParser.Conditional_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(@NotNull CsParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(@NotNull CsParser.And_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(@NotNull CsParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(@NotNull CsParser.Primary_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void enterShift_expression(@NotNull CsParser.Shift_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void exitShift_expression(@NotNull CsParser.Shift_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void enterIteration_statement(@NotNull CsParser.Iteration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void exitIteration_statement(@NotNull CsParser.Iteration_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_or_expression(@NotNull CsParser.Logical_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_or_expression(@NotNull CsParser.Logical_or_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterType_specifier(@NotNull CsParser.Type_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitType_specifier(@NotNull CsParser.Type_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#declarator_suffix}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator_suffix(@NotNull CsParser.Declarator_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#declarator_suffix}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator_suffix(@NotNull CsParser.Declarator_suffixContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(@NotNull CsParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(@NotNull CsParser.Parameter_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#argument_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_expression_list(@NotNull CsParser.Argument_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#argument_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_expression_list(@NotNull CsParser.Argument_expression_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CsParser#constructor_call}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_call(@NotNull CsParser.Constructor_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsParser#constructor_call}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_call(@NotNull CsParser.Constructor_callContext ctx);
}