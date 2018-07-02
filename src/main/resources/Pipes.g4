grammar Pipes;

root: valueDeclaration* properties? valueDeclaration* repositories? valueDeclaration* outputs? valueDeclaration* steps? EOF;

valueDeclaration: parameterDeclaration | variableDeclaration;
parameterDeclaration: parameterName '=' parameterValue;
parameterName: 'params.' ID;
parameterValue: directValue;
variableDeclaration: variableName '=' variableValue;
variableName: ID;
variableValue: directValue;

properties: 'Properties' ':' '{' authorProperty? descriptionProperty? versionProperty? documentationProperty? '}';
authorProperty: 'author' ':' STRING;
descriptionProperty: 'description' ':' STRING;
versionProperty: 'version' ':' STRING;
documentationProperty: 'documentation' ':' '[' (STRING (',' STRING)*)? ']';

repositories: 'Repositories' ':' '[' repository* ']';
repository: toolRepository | pipelineRepository;
toolRepository: 'ToolRepository' repositoryId ':' '{' locationProperty? configProperty? '}';
pipelineRepository: 'PipelineRepository' repositoryId ':' '{' locationProperty? configProperty? '}';
repositoryId: ID;
locationProperty: 'location' ':' locationValue;
locationValue: STRING;
configProperty: 'config' ':' '{' config* '}';
config: configName ':' configValue;
configName: ID;
configValue: value;

outputs: 'Outputs' ':' '{' output* '}';
output: outputId ':' outputValue;
outputId: ID;
outputValue: stepId '[' outputName ']';
outputName: ID;

steps: 'Steps' ':' '[' step* ']';
step: 'Step' stepId ':' '{' execProperty? executionContextProperty? inputsProperty? spreadProperty? '}';
stepId: ID;
execProperty: 'exec' ':' (commandReference | pipelineReference);
commandReference: repositoryId '[' toolName ']' '[' commandName ']';
toolName: ID;
commandName: ID;
pipelineReference: repositoryId '[' pipelineName ']';
pipelineName: ID;
executionContextProperty: 'execution_context' ':' value;
inputsProperty: 'inputs' ':' '{' inputProperty* '}';
inputProperty: inputName ':' inputValue;
inputName: ID;
inputValue: value | chain;
chain: stepId '[' outputName ']';
spreadProperty: 'spread' ':' '{' spreadInputsToSpreadProperty? spreadStrategyProperty? '}';
spreadStrategyProperty: 'strategy' ':' combineStrategy;
strategyValue: combineStrategy | inputName;
combineStrategy: oneToOneStrategy | oneToManyStrategy;
oneToOneStrategy: 'one_to_one' '(' strategyValue ',' strategyValue ')';
oneToManyStrategy: 'one_to_many' '(' strategyValue ',' strategyValue ')';
spreadInputsToSpreadProperty: 'inputs_to_spread' ':'  '[' (inputName (',' inputName)*)? ']';

value: directValue | indirectValue;
indirectValue: parameterName | variableName;
directValue: STRING | NUMBER | BOOLEAN | array;
array: '[' (directValue (',' directValue)*)? ']';

ID: ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
STRING: '"' ( '\\"' | . )*? '"';
BOOLEAN: ('true' | 'false');
NUMBER: '-'? INT ('.' [0-9] +)?;
fragment INT: '0' | [1-9] [0-9]*;

COMMENT: '/*' .*? '*/' -> skip; // .*? matches anything until the first */
WS: [ \t\r\n]+ -> skip; // skip spaces, tabs, newlines
