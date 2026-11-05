fun main() {
    // 1. Contagem Regressiva de Lançamento
    // Enunciado: Escreva um programa que exiba na tela a contagem regressiva de 10 até 1.
    // Logo após a contagem, mostre a mensagem final: "Contagem finalizada! VAI!".
    for (i in 10 downTo 1) {
        println(i)
    }
    println("Contagem finalizada! VAI!")

    // 2. Tabuada Simples
    // Enunciado: Declare uma variável inteira numero. Utilizando o laço for e o intervalo 1..10,
    // imprima a tabuada desse número.
    val numero = 7
    for (i in 1..10) {
        println("$numero x $i = ${numero * i}")
    }

    // 3. Soma de Números em Intervalo
    // Enunciado: Escreva um algoritmo que calcule a soma de todos os números inteiros de 1 a 100
    // e exiba o resultado final dessa soma no console.
    var soma = 0
    for (i in 1..100) {
        soma += i
    }
    println("Soma total de 1 a 100: $soma")

    // 4. Listagem de Itens de Carrinho de Compras
    // Enunciado: Crie uma lista imutável de nomes de produtos e utilize o laço for para percorrer
    // a lista e imprimir cada produto no formato "Item no carrinho: [nome do produto]".
    val carrinho = listOf("Camiseta", "Calça", "Tênis", "Boné")
    for (produto in carrinho) {
        println("Item no carrinho: $produto")
    }

    // 5. Validação de Senha com Tentativas Limitadas
    // Enunciado: Crie um programa que execute a validação simulada e imprima as tentativas.
    // Deve realizar pelo menos uma verificação antes de testar a condição de parada para encerrar após a 3ª tentativa.
    var tentativa = 1
    val limite = 3
    do {
        println("Tentativa $tentativa: Validando credenciais...")
        tentativa++
    } while (tentativa <= limite)

    // 6. Filtragem de Números Pares em Intervalo Personalizado
    // Enunciado: Crie um laço for que percorra os números inteiros de 2 a 50 utilizando o parâmetro step 2.
    // Acumule a soma desses números e imprima o valor total acumulado.
    var somaPares = 0
    for (i in 2..50 step 2) {
        somaPares += i
    }
    println("Soma dos números pares de 2 a 50: $somaPares")

    // 7. Leitura e Monitoramento de Processamento
    // Enunciado: Simule o progresso do download de 0% a 100%, avançando de 10 em 10%.
    // Se o progresso atingir 50%, exiba a mensagem de erro e interrompa a repetição.
    for (progresso in 0..100 step 10) {
        if (progresso == 50) {
            println("Erro no download! Operação cancelada.")
            break
        }
        println("Download em $progresso%")
    }

    // 8. Pular Itens Indisponíveis no Estoque
    // Enunciado: Crie uma lista com nomes de pratos e declare itemEsgotado = "Pizza".
    // Percorra com o laço for. Se o item for igual ao itemEsgotado, use continue para pular.
    val pratos = listOf("Hambúrguer", "Pizza", "Massa", "Salada")
    val itemEsgotado = "Pizza"
    for (prato in pratos) {
        if (prato == itemEsgotado) {
            continue
        }
        println("Item disponível: $prato")
    }

    // 9. Busca por Índice e Elemento
    // Enunciado: Dada uma lista com 4 tarefas, percorra essa lista e imprima cada item acompanhado
    // do seu número de ordem (iniciando em 1).
    val tarefas = listOf("Estudar Kotlin", "Fazer exercícios", "Comprar pão", "Limpar casa")
    for ((index, tarefa) in tarefas.withIndex()) {
        println("Tarefa ${index + 1}: $tarefa")
    }

    // 10. Simulador de Caixas Eletrônicos - Depósito Acumulado
    // Enunciado: Considere a meta de R$ 500.00 e uma lista de depósitos simulados.
    // Processe depósito por depósito até que o saldo acumulado atinja ou ultrapasse a meta.
    val meta = 500.0
    val depositos = listOf(100.0, 150.0, 200.0, 100.0, 50.0)
    var saldoAtual = 0.0
    for (deposito in depositos) {
        saldoAtual += deposito
        if (saldoAtual >= meta) {
            println("Meta atingida! Saldo atual: R$ $saldoAtual")
            break
        }
    }

    // 11. Análise de Padrões e Desenho de Matrizes
    // Enunciado: Escreva dois laços for aninhados para imprimir um quadrado N x N (N=5).
    // Se a linha for igual à coluna, imprima 'X' em vez de '*'.
    val n = 5
    for (linha in 0 until n) {
        for (coluna in 0 until n) {
            if (linha == coluna) {
                print("X ")
            } else {
                print("* ")
            }
        }
        println()
    }

    // 12. Validação Multicritério em Múltiplas Contas de Usuários
    // Enunciado: Percorra duas listas paralelas (nomes e idades) e classifique cada usuário conforme a regra da faixa etária.
    val nomes = listOf("Ana", "Bruno", "Carlos", "Diana")
    val idades = listOf(17, 21, 15, 30)
    for (i in nomes.indices) {
        val nome = nomes[i]
        val idade = idades[i]
        val classificacao = when {
            idade < 18 -> "Acesso Negado (Menor de idade)"
            idade in 18..25 -> "Acesso Permitido (Perfil Jovem)"
            else -> "Acesso Permitido (Perfil Sênior)"
        }
        println("$nome: $classificacao")
    }

    // 13. Verificador de Números Primos
    // Enunciado: Declare numero = 29. Crie uma lógica utilizando o laço for e uma variável booleana ehPrimo
    // para determinar se o número é primo.
    val numeroPrimo = 29
    var ehPrimo = true
    for (i in 2 until numeroPrimo) {
        if (numeroPrimo % i == 0) {
            ehPrimo = false
            break
        }
    }
    if (ehPrimo && numeroPrimo > 1) {
        println("O número $numeroPrimo é primo.")
    } else {
        println("O número $numeroPrimo não é primo.")
    }

    // 14. Cálculo de Fatorial com Tratamento de Casos Limite
    // Enunciado: Escreva um programa que calcule o fatorial de um número. Trate os casos especiais (0 e 1)
    // e utilize uma estrutura iterativa.
    val numeroFatorial = 6
    var fatorial: Long = 1
    if (numeroFatorial < 0) {
        println("Não existe fatorial para números negativos.")
    } else {
        for (i in numeroFatorial downTo 1) {
            fatorial *= i
        }
        println("O fatorial de $numeroFatorial é $fatorial")
    }

    // 15. Processador de Transações Financeiras com Cancelamento por Rótulo
    // Enunciado: Percorra lotes e transações. Ao identificar qualquer valor menor que 0.0,
    // interrompa o processamento de todas as repetições usando um rótulo (label).
    val lotes = listOf(
        listOf(100.0, 50.0, 200.0),
        listOf(80.0, -20.0, 150.0),
        listOf(30.0, 40.0)
    )
    loopLotes@ for (lote in lotes) {
        for (transacao in lote) {
            if (transacao < 0.0) {
                println("Transação inválida encontrada (R$ $transacao). Interrompendo todo o processamento!")
                break@loopLotes
            }
            println("Processando transação: R$ $transacao")
        }
    }
}