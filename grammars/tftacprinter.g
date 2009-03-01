// ######################################################################################
// ######################################################################################
// ######################################################################################
// ######################################################################################
tree grammar tftacprinter;

options {      
 tokenVocab=tftac; 
 output=template;
 ASTLabelType=CommonTree;
}

infixform
	:   	^(PAND a=infixform b=infixform)   
			-> template(a={$a.st},b={$b.st}) "(<a> PAND <b>)"
	|  	^(AND  a=infixform b=infixform)   
			-> template(a={$a.st},b={$b.st}) "(<a> AND <b>)"   
	|   	^(SAND  a=infixform b=infixform)   
			-> template(a={$a.st},b={$b.st}) "(<a> SAND <b>)"
	|   	^(OR  a=infixform b=infixform)   
			-> template(a={$a.st},b={$b.st}) "(<a> OR <b>)"
	|   	^(XOR  a=infixform b=infixform)   
			-> template(a={$a.st},b={$b.st}) "(<a> XOR <b>)"
	|   	^(NOT  a=infixform)   
			-> template(a={$a.st}) "(NOT <a>)"
    	|   	ID	-> template(a={$ID.text}) "<a>"
	|	TRUE	-> {%{"TRUE"}}
	|	FALSE	-> {%{"FALSE"}}		
    	;
