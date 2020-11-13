# programaFotossintese
![Badge](https://img.shields.io/badge/language-java-brightgreen?label=language&message=java) | ![Badge](https://img.shields.io/badge/language-java-brightgreen?label=version&message=1.0.2)

### Projeto do terceiro semestre do curso Ciência da Computação

Programa desenvolvido em Java, executado em console, para exemplificar o processo da fotossíntese, programa simples, demonstrando orientação a objeto, com a utilização de IO. Nesse programa temos a utilização de um arquivo, usado para salvamos e carregarmos os dados.
No arquivo save, é inserido até 2 slots para salvar as informações e até sobrescreve-las.

#### Entrada

O programa é iniciado solicitando ao usuário o seu nome, a categoria da planta que deseja utilizar, nessa opção é possível escolher entre as categorias: árvore, flor, fruta, legume, tempero e vegetal. Cada opção contêm valores diferentes para seu desenvolvimento até seu estado de colheita, um bom exemplo para demonstrar como o desmatamento causa uma perda terrível, enfim, após escolher a categoria será solicitado escolher o nome da planta e o apelido para ela.

Caso contenha o arquivo save, o programa já exibirá no inicio uma opção para carregar os dados e escolher o save que deseja caso tenha mais de um.

#### Funcionamento

Terá um menu para que intereja com o usuário, nesse menu existem as opções para regar, exibir informações, colher a planta, matar a planta, dormir, salvar e sair. A pessoa regará duas vezes por dia e logo após será necessário que ela durma, para que vá ao dia seguinte, nesse processo a planta realizará a contagem de energia devido ao processo de fotossíntese que ocorreu no dia, repetirá o processo até que a planta tenha a quantidade necessária para que possa ser colhida. A planta pode ser morta a qualquer momento, ao matá-la ainda estará no menu porém só vai conseguir salvar e sair do jogo.

Os dados são guardados em um arquivo com formato txt, sua interação é por linha e cada linha específica conterá um dado, sendo que contêm uma sequência para os dados em que determinada quantidade de linha é do primeiro save ou do segundo save. No programa se não existir o arquivo o mesmo criará.

#### Saída

O usuário estará ciente de toda a situação de sua planta, quantidade de vezes que precisa regar, quando precisa dormir, quando poderá regar, o programa vai informar quando precisar fazer algo ou quando tentar realizar alguma ação inválida no momento.
