
fun main() {
    println("--- Executando Algoritmos 11 a 130 ---")
    alg11()
    alg12()
    alg13()
    alg14()
    alg15()
    alg16()
    alg17()
    alg18()
    alg19()
   }

// Algoritmo 11
fun alg11() {
    println("Aprendendo Algoritmo!!!")
}

// Algoritmo 12
fun alg12() {
    print("Aprendendo Algoritmo!!!")
    print("Com Anita e Guto\n")
}

// Algoritmo 13
fun alg13() {
    print("Aprendendo Algoritmo!!!")
    print("\nCom Anita e Guto\n")
}

// Algoritmo 14
fun alg14() {
    print("Aprendendo Algoritmo!!!\n")
    print("Com Anita e Guto\n")
}

// Algoritmo 15
fun alg15() {
    println("Aprendendo Algoritmo\nCom Anita e Guto\n\nE implementando\nFica muito mais fácil!!")
}

// Algoritmo 16
fun alg16() {
    val x = 10
    println(x)
}

// Algoritmo 17
fun alg17() {
    val x = 10
    println("Valor de x = $x")
}

// Algoritmo 18
fun alg18() {
    val x = 10
    println("Valor de x + 1 = ${x + 1}")
}

// Algoritmo 19
fun alg19() {
    println("raiz: ${sqrt(64.0)}")
    println("potência: ${8.0.pow(3.0)}")
    println("absoluto: ${abs(-8)}")
    println("arredondado 5.51: ${5.51.roundToInt()}")
    println("inteiro 87 para real: ${87.toDouble()}")
    println("divisão inteira 3/4: ${3 / 4}")
}

// Algoritmo 20
fun alg20() {
    print("Digite palavra 1: ")
    val c = readLine()!!
    print("Digite palavra 2: ")
    val c1 = readLine()!!
    println("Tamanho: ${c.length}")
    println("Concatenando: ${c + c1}")
    println("Primeiro caractere: ${c.first()}")
    println("Último caractere: ${c.last()}")
    println("Todos menos o primeiro: ${c.drop(1)}")
    println("Três primeiros: ${c.take(3)}")
    println("Três últimos: ${c.takeLast(3)}")
}

// Algoritmo 21
fun alg21() {
    println("12 + 5 / 2 = ${12 + 5 / 2.0}")
    println("(12 + 5) / 2 = ${(12 + 5) / 2.0}")
    println("3 * (7 % 5) = ${3 * (7 % 5)}")
    println("(3 * 7) % 5 = ${(3 * 7) % 5}")
    println("3 * 7 / 5 (inteira) = ${3 * 7 / 5}")
}

// Algoritmo 22
fun alg22() {
    println("20 / 4 / 2 = ${20 / 4 / 2}")
    println("30 / 4 / 2 = ${30 / 4 / 2}")
    println("7 / 4 = ${7 / 4}")
    println("6 / 4 = ${6 / 4}")
}

// Algoritmo 23
fun alg23() {
    print("Digite número de três casas: ")
    val a = readLine()!!.toInt()
    val d = (a % 100) / 10
    println("Algarismo das dezenas: $d")
}

// Algoritmo 24
fun alg24() {
    print("Digite número de três casas: ")
    val a = readLine()!!.toInt()
    val d = (a / 10) % 10
    println("Algarismo das dezenas: $d")
}

// Algoritmo 25
fun alg25() {
    print("Digite data no formato ddmmaa: ")
    val data = readLine()!!.toInt()
    val dia = data / 10000
    val mes = (data % 10000) / 100
    val ano = data % 100
    println("DIA: $dia")
    println("MES: $mes")
    println("ANO: $ano")
}

// Algoritmo 26
fun alg26() {
    print("Digite data no formato ddmmaa: ")
    val data = readLine()!!.toInt()
    val dia = data / 10000
    val mes = (data % 10000) / 100
    val ano = data % 100
    val novaData = mes * 10000 + dia * 100 + ano
    println("Data no formato mmddaa: $novaData")
}

// Algoritmo 27
fun alg27() {
    var x = 2
    var y = 5
    println("x = $x")
    x++
    println("y = $y")
    y--
    println("novo valor de x = $x")
    println("novo valor de y = $y")
}

// Algoritmo 28
fun alg28() {
    println("É PRECISO FAZER TODOS OS ALGORITMOS PARA APRENDER")
}

// Algoritmo 29
fun alg29() {
    println("Toni")
}

// Algoritmo 30
fun alg30() {
    val produto = 28 * 43
    println("O produto entre os dois é: $produto")
}

// Algoritmo 31
fun alg31() {
    val ma = (8 + 9 + 7) / 3.0
    println("A média aritmética é: $ma")
}

// Algoritmo 32
fun alg32() {
    print("Entre com um número: ")
    val num = readLine()!!.toInt()
    println("Número: $num")
}

// Algoritmo 33
fun alg33() {
    print("Entre com um número: ")
    val num1 = readLine()!!.toInt()
    print("Entre com outro número: ")
    val num2 = readLine()!!.toInt()
    println("Número 1: $num1")
    println("Número 2: $num2")
}

// Algoritmo 34
fun alg34() {
    print("Entre com um número: ")
    val numero = readLine()!!.toInt()
    val ant = numero - 1
    val suc = numero + 1
    println("O sucessor é $suc e o antecessor é $ant")
}

// Algoritmo 35
fun alg35() {
    print("Entre com nome: ")
    val nome = readLine()!!
    print("Entre com endereço: ")
    val endereco = readLine()!!
    print("Entre com telefone: ")
    val telefone = readLine()!!
    println()
    println("Nome: $nome")
    println("Endereço: $endereco")
    println("Telefone: $telefone")
}

// Algoritmo 36
fun alg36() {
    print("Entre com um número: ")
    val num1 = readLine()!!.toInt()
    print("Entre com outro número: ")
    val num2 = readLine()!!.toInt()
    val soma = num1 + num2
    println("Soma: $soma")
}

// Algoritmo 37
fun alg37() {
    print("Entre com um número: ")
    val num1 = readLine()!!.toInt()
    print("Entre com outro número: ")
    val num2 = readLine()!!.toInt()
    val prod = num1 * num2
    println("Produto: $prod")
}

// Algoritmo 38
fun alg38() {
    print("Entre com um número com ponto: ")
    val num = readLine()!!.toDouble()
    println("A terça parte é: ${num / 3.0}")
}

// Algoritmo 39
fun alg39() {
    print("Digite a 1ª nota: ")
    val nota1 = readLine()!!.toDouble()
    print("Digite a 2ª nota: ")
    val nota2 = readLine()!!.toDouble()
    val media = (nota1 + nota2) / 2.0
    println("Média: $media")
}

// Algoritmo 40
fun alg40() {
    print("Entre com o dividendo: ")
    val val1 = readLine()!!.toInt()
    print("Entre com o divisor: ")
    val val2 = readLine()!!.toInt()
    val quoc = val1 / val2
    val rest = val1 % val2
    println("Dividendo: $val1")
    println("Divisor: $val2")
    println("Quociente: $quoc")
    println("Resto: $rest")
}

// Algoritmo 41
fun alg41() {
    print("Entre com 1º número: ")
    val a = readLine()!!.toDouble()
    print("Entre com 2º número: ")
    val b = readLine()!!.toDouble()
    print("Entre com 3º número: ")
    val c = readLine()!!.toDouble()
    print("Entre com 4º número: ")
    val d = readLine()!!.toDouble()
    val mp = (a * 1 + b * 2 + c * 3 + d * 4) / 10.0
    println("Média ponderada: $mp")
}

// Algoritmo 42
fun alg42() {
    print("Digite um ângulo em graus: ")
    val angulo = readLine()!!.toDouble()
    val rang = angulo * PI / 180.0
    println("Seno: ${sin(rang)}")
    println("Co-seno: ${cos(rang)}")
    println("Tangente: ${tan(rang)}")
    println("Co-secante: ${1.0 / sin(rang)}")
    println("Secante: ${1.0 / cos(rang)}")
    println("Cotangente: ${1.0 / tan(rang)}")
}

// Algoritmo 43
fun alg43() {
    print("Entre com o logaritmando: ")
    val num = readLine()!!.toDouble()
    val logaritmo = ln(num) / ln(10.0)
    println("Logaritmo: $logaritmo")
}

// Algoritmo 44
fun alg44() {
    print("Entre com o logaritmando: ")
    val num = readLine()!!.toDouble()
    print("Entre com a base: ")
    val base = readLine()!!.toDouble()
    val logaritmo = ln(num) / ln(base)
    println("O logaritmo de $num na base $base é: $logaritmo")
}

// Algoritmo 45
fun alg45() {
    print("Digite número: ")
    val num = readLine()!!.toDouble()
    val quad = num.pow(2.0)
    val raizQuad = sqrt(num)
    println("Número: $num")
    println("Quadrado: $quad")
    println("Raiz quadrada: $raizQuad")
}

// Algoritmo 46
fun alg46() {
    print("Digite saldo: ")
    val saldo = readLine()!!.toDouble()
    val nsaldo = saldo * 1.01
    println("Novo saldo: $nsaldo")
}

// Algoritmo 47
fun alg47() {
    print("Entre com um número de 3 dígitos: ")
    val num = readLine()!!.toInt()
    val c = num / 100
    val d = (num % 100) / 10
    val u = num % 10
    val num1 = u * 100 + d * 10 + c
    println("Número: $num")
    println("Invertido: $num1")
}

// Algoritmo 48
fun alg48() {
    print("Entre com o salário mínimo: ")
    val sm = readLine()!!.toDouble()
    print("Entre com a quantidade em quilowatt: ")
    val qtdade = readLine()!!.toDouble()
    val preco = sm / 700.0
    val vp = preco * qtdade
    val vd = vp * 0.9
    println("Preço do quilowatt: $preco")
    println("Valor a ser pago: $vp")
    println("Valor com desconto: $vd")
}

// Algoritmo 49
fun alg49() {
    print("Entre com nome: ")
    val nome = readLine()!!
    println("Todo nome: $nome")
    println("Primeiro caractere: ${nome.first()}")
    println("Último caractere: ${nome.last()}")
    println("Primeiro ao terceiro: ${nome.take(3)}")
    println("Quarto caractere: ${nome[3]}")
    println("Todos menos o primeiro: ${nome.drop(1)}")
    println("Os dois últimos: ${nome.takeLast(2)}")
}

// Algoritmo 50
fun alg50() {
    print("Digite base: ")
    val base = readLine()!!.toDouble()
    print("Digite altura: ")
    val altura = readLine()!!.toDouble()
    val perimetro = 2 * (base + altura)
    val area = base * altura
    val diagonal = sqrt(base.pow(2.0) + altura.pow(2.0))
    println("Perímetro = $perimetro")
    println("Área = $area")
    println("Diagonal = $diagonal")
}

// Algoritmo 51
fun alg51() {
    print("Digite raio: ")
    val raio = readLine()!!.toDouble()
    val perimetro = 2 * PI * raio
    val area = PI * raio.pow(2.0)
    println("Perímetro: $perimetro")
    println("Área: $area")
}

// Algoritmo 52
fun alg52() {
    print("Digite o lado do quadrado: ")
    val lado = readLine()!!.toDouble()
    val perimetro = 4 * lado
    val area = lado.pow(2.0)
    val diagonal = lado * sqrt(2.0)
    println("Perímetro: $perimetro")
    println("Área: $area")
    println("Diagonal: $diagonal")
}

// Algoritmo 53
fun alg53() {
    print("Entre com a base: ")
    val a = readLine()!!.toDouble()
    print("Entre com a altura: ")
    val b = readLine()!!.toDouble()
    print("Entre com a profundidade: ")
    val c = readLine()!!.toDouble()
    val diagonal = sqrt(a.pow(2.0) + b.pow(2.0) + c.pow(2.0))
    println("Diagonal: $diagonal")
}

// Algoritmo 54
fun alg54() {
    print("Entre com a base: ")
    val a = readLine()!!.toDouble()
    print("Entre com a altura do triângulo: ")
    val b = readLine()!!.toDouble()
    println("Área = ${(a * b) / 2.0}")
}

// Algoritmo 55
fun alg55() {
    print("Medida da diagonal maior: ")
    val diagMaior = readLine()!!.toDouble()
    print("Medida da diagonal menor: ")
    val diagMenor = readLine()!!.toDouble()
    val area = (diagMaior * diagMenor) / 2.0
    println("Área = $area")
}

// Algoritmo 56
fun alg56() {
    print("Digite nome: ")
    val nome = readLine()!!
    print("Digite idade: ")
    val idade = readLine()!!.toInt()
    println()
    println("Nome = $nome")
    println("Idade = $idade")
}

// Algoritmo 57
fun alg57() {
    print("Digite PR1: ")
    val pr1 = readLine()!!.toDouble()
    print("Digite PR2: ")
    val pr2 = readLine()!!.toDouble()
    val mf = (pr1 + pr2) / 2.0
    println("Média truncada = ${mf.toInt()}")
    println("Média arredondada = ${mf.roundToInt()}")
}

// Algoritmo 58
fun alg58() {
    print("Entrar com 1º valor: ")
    val xnum1 = readLine()!!.toDouble()
    print("Entrar com 2º valor: ")
    val xnum2 = readLine()!!.toDouble()
    print("Entrar com 3º valor: ")
    val xnum3 = readLine()!!.toDouble()
    val x = xnum1 + xnum2 / (xnum3 + xnum1) + 2 * (xnum1 - xnum2) + ln(64.0) / ln(2.0)
    println("X = $x")
}

// Algoritmo 59
fun alg59() {
    print("Entrar com 1º cateto: ")
    val b = readLine()!!.toDouble()
    print("Entrar com 2º cateto: ")
    val c = readLine()!!.toDouble()
    val a = sqrt(b.pow(2.0) + c.pow(2.0))
    println("A hipotenusa é: $a")
}

// Algoritmo 60
fun alg60() {
    print("Entrar com o 1º termo: ")
    val termo = readLine()!!.toInt()
    print("Entrar com a razão: ")
    val razao = readLine()!!.toInt()
    val dec = termo + 9 * razao
    println("O 10º termo desta P.A. é: $dec")
}

// Algoritmo 61
fun alg61() {
    print("Entre com o 1º termo: ")
    val termo = readLine()!!.toInt()
    print("Entre com a razão: ")
    val razao = readLine()!!.toInt()
    var quinto = termo
    for (i in 1..4) {
        quinto *= razao
    }
    println("O 5º termo desta P.G. é: $quinto")
}

// Algoritmo 62
fun alg62() {
    print("Digite valor do produto: ")
    val preco = readLine()!!.toDouble()
    val npreco = preco * 0.91
    println("Preço com desconto: $npreco")
}

// Algoritmo 63
fun alg63() {
    print("Horas trabalhadas: ")
    val na = readLine()!!.toInt()
    print("Valor da hora-aula: ")
    val vha = readLine()!!.toDouble()
    print("Percentual de desconto: ")
    val pd = readLine()!!.toDouble()
    val sb = na * vha
    val td = (pd / 100.0) * sb
    val sl = sb - td
    println("Salário líquido: $sl")
}

// Algoritmo 64
fun alg64() {
    print("Digite a temperatura em graus centígrados: ")
    val c = readLine()!!.toDouble()
    val f = (9 * c + 160) / 5.0
    println("Temperatura em Fahrenheit = $f")
}

// Algoritmo 65
fun alg65() {
    print("Digite a altura da lata: ")
    val altura = readLine()!!.toDouble()
    print("Digite o raio da lata: ")
    val raio = readLine()!!.toDouble()
    val volume = PI * raio.pow(2.0) * altura
    println("O volume da lata é $volume")
}

// Algoritmo 66
fun alg66() {
    print("Digite o tempo gasto: ")
    val tempo = readLine()!!.toDouble()
    print("Digite a velocidade média: ")
    val vel = readLine()!!.toDouble()
    val dist = tempo * vel
    val litros = dist / 12.0
    println("Velocidade = $vel")
    println("Tempo = $tempo")
    println("Distância = $dist")
    println("Litros = $litros")
}

// Algoritmo 67
fun alg67() {
    print("Digite o valor da prestação: ")
    val valor = readLine()!!.toDouble()
    print("Digite a taxa: ")
    val taxa = readLine()!!.toDouble()
    print("Digite o tempo (número de meses): ")
    val tempo = readLine()!!.toInt()
    val prest = valor + (valor * (taxa / 100.0) * tempo)
    println("O valor da prestação em atraso é $prest")
}

// Algoritmo 68
fun alg68() {
    print("Digite 1º número com ponto: ")
    var a = readLine()!!.toDouble()
    print("Digite 2º número com ponto: ")
    var b = readLine()!!.toDouble()
    val aux = a
    a = b
    b = aux
    println("a = $a")
    println("b = $b")
}

// Algoritmo 69
fun alg69() {
    print("Digite numerador: ")
    val num = readLine()!!.toInt()
    print("Digite denominador: ")
    val denom = readLine()!!.toInt()
    println("Decimal: ${num.toDouble() / denom}")
}

// Algoritmo 70
fun alg70() {
    print("Entre com o valor da conta: ")
    val cres = readLine()!!.toDouble()
    val cgorj = cres * 1.1
    println("O valor da conta com a gorjeta será: ${"%.2f".format(cgorj)}")
}

// Algoritmo 71
fun alg71() {
    print("Entre com hora atual: ")
    val hora = readLine()!!.toInt()
    print("Entre com minutos: ")
    val minuto = readLine()!!.toInt()
    val tminuto = hora * 60 + minuto
    println("Até agora se passaram: $tminuto minutos")
}

// Algoritmo 72
fun alg72() {
    print("Entre com depósito: ")
    val deposito = readLine()!!.toDouble()
    print("Entre com a taxa de juros: ")
    val taxa = readLine()!!.toDouble()
    val valor = deposito * taxa / 100.0
    val total = deposito + valor
    println("Rendimentos: $valor")
    println("Total: $total")
}

// Algoritmo 73
fun alg73() {
    print("Entre com um número com parte fracionária: ")
    val num = readLine()!!.toDouble()
    val numi = num.toInt()
    val numfrac = num - numi
    val numa = num.roundToInt()
    println("Parte inteira: $numi")
    println("Parte fracionária: ${"%.3f".format(numfrac)}")
    println("Número arredondado: $numa")
}

// Algoritmo 74
fun alg74() {
    print("Entre com o salário mínimo: ")
    val salmin = readLine()!!.toDouble()
    print("Entre com o salário da pessoa: ")
    val salpe = readLine()!!.toDouble()
    val num = salpe / salmin
    println("A pessoa ganha $num salários mínimos")
}

// Algoritmo 75
fun alg75() {
    print("Entre com seu peso, só a parte inteira: ")
    val peso = readLine()!!.toInt()
    val pesoGramas = peso * 1000
    val novoPeso = (pesoGramas * 1.12).toInt()
    println("Peso em gramas: $pesoGramas")
    println("Novo peso: $novoPeso")
}

// Algoritmo 76
fun alg76() {
    print("Digite número: ")
    val num = readLine()!!.toInt()
    println("Sucessor: ${(num + 1) % 61}")
}

// Algoritmo 77
fun alg77() {
    print("Digite 1º número: ")
    val a = readLine()!!.toDouble()
    print("Digite 2º número: ")
    val b = readLine()!!.toDouble()
    val d = (a - b).pow(2.0)
    val q = a.pow(2.0) - b.pow(2.0)
    println("O quadrado da diferença = $d")
    println("Diferença dos quadrados = $q")
}

// Algoritmo 78
fun alg78() {
    print("Digite o número de lados do polígono: ")
    val n = readLine()!!.toInt()
    val nd = n * (n - 3) / 2.0
    println("Número de diagonais: $nd")
}

// Algoritmo 79
fun alg79() {
    print("Digite o valor da aplicação: ")
    val p = readLine()!!.toDouble()
    print("Digite a taxa (ex: 0.01): ")
    val i = readLine()!!.toDouble()
    print("Digite o número de meses: ")
    val n = readLine()!!.toInt()
    val va = p * ((1 + i).pow(n.toDouble()) - 1) / i
    println("O valor acumulado: $va")
}

// Algoritmo 80
fun alg80() {
    print("Digite a quantidade de fitas: ")
    val quant = readLine()!!.toInt()
    print("Digite o valor do aluguel: ")
    val valAluguel = readLine()!!.toDouble()
    val fatAnual = (quant / 3.0) * valAluguel * 12
    println("Faturamento anual: $fatAnual")
    val multas = valAluguel * 0.1 * (quant / 3.0) / 10.0
    println("Multas mensais: $multas")
    val quantFinal = quant - (quant * 0.02) + (quant / 10.0)
    println("Quantidade de fitas no final do ano: $quantFinal")
}

// Algoritmo 81
fun alg81() {
    print("Digite conta de três dígitos: ")
    val conta = readLine()!!.toInt()
    val d1 = conta / 100
    val d2 = (conta % 100) / 10
    val d3 = conta % 10
    val inv = d3 * 100 + d2 * 10 + d1
    val soma = conta + inv
    val sd1 = (soma / 100) * 1
    val sd2 = ((soma % 100) / 10) * 2
    val sd3 = (soma % 10) * 3
    val digito = (sd1 + sd2 + sd3) % 10
    println("Digito verificador: $digito")
}

// Algoritmo 82
fun alg82() {
    print("Digite número: ")
    val numero = readLine()!!.toDouble()
    if (numero > 20) {
        val met = numero / 2.0
        println("Metade: $met")
    }
}

// Algoritmo 83
fun alg83() {
    print("Digite número: ")
    val numero = readLine()!!.toDouble()
    if (numero > 0) {
        println("Inverso: ${1.0 / numero}")
    } else {
        println("Absoluto: ${abs(numero)}")
    }
}

// Algoritmo 84
fun alg84() {
    print("Digite número: ")
    val a = readLine()!!.toInt()
    if (a % 2 == 0) {
        println("PAR")
    } else {
        println("ÍMPAR")
    }
}

// Algoritmo 85
fun alg85() {
    print("Digite 1º número: ")
    val a = readLine()!!.toDouble()
    print("Digite 2º número: ")
    val b = readLine()!!.toDouble()
    print("Digite 3º número: ")
    val c = readLine()!!.toDouble()
    val max: Double = if (a > b) {
        if (a > c) a else c
    } else {
        if (b > c) b else c
    }
    println(max)
}

// Algoritmo 86
fun alg86() {
    print("Digite número: ")
    val num = readLine()!!.toDouble()
    if (num > 0) {
        println("POSITIVO")
    } else if (num < 0) {
        println("NEGATIVO")
    } else {
        println("NULO")
    }
}

// Algoritmo 87
fun alg87() {
    print("Qual a capital do Brasil? ")
    val resp = readLine()!!
    if (resp == "BRASÍLIA" || resp == "Brasília") {
        println("PARABÉNS!")
    } else if (resp == "brasilia" || resp == "Brazília" || resp == "BRAZÍLIA" || resp == "brazília") {
        println("CERTO! Mas atenção para grafia: Brasília ou BRASÍLIA")
    } else {
        println("ERRADO! ESTUDE MAIS!")
    }
}

// Algoritmo 88
fun alg88() {
    println("*************")
    println("*CALCULADORA*")
    println("*************")
    println("+ para somar")
    println("- para subtrair")
    println("* para multiplicar")
    println("/ para dividir")
    print("Digite opção: ")
    val resp = readLine()!!
    if (resp == "+" || resp == "-" || resp == "*" || resp == "/") {
        print("Digite 1º número: ")
        val a = readLine()!!.toDouble()
        print("Digite 2º número: ")
        val b = readLine()!!.toDouble()
        if (resp == "+") {
            println("SOMA: ${a + b}")
        } else if (resp == "-") {
            println("SUBTRAÇÃO: ${a - b}")
        } else if (resp == "*") {
            println("MULTIPLICAÇÃO: ${a * b}")
        } else {
            println("DIVISÃO: ${a / b}")
        }
    } else {
        println("OPÇÃO NÃO DISPONÍVEL!")
    }
}

// Algoritmo 89
fun alg89() {
    println("Planetas que podem ser analisados:")
    println("1 Mercúrio")
    println("2 Vênus")
    println("3 Marte")
    println("4 Júpiter")
    println("5 Saturno")
    println("6 Urano")
    print("Escolha o planeta a ser analisado: ")
    val op = readLine()!!.toInt()
    print("Entre com um peso na Terra: ")
    val pterra = readLine()!!.toDouble()
    when (op) {
        1 -> println("Seu peso no planeta: ${(pterra / 10.0) * 0.37}")
        2 -> println("Seu peso no planeta: ${(pterra / 10.0) * 0.88}")
        3 -> println("Seu peso no planeta: ${(pterra / 10.0) * 0.38}")
        4 -> println("Seu peso no planeta: ${(pterra / 10.0) * 2.64}")
        5 -> println("Seu peso no planeta: ${(pterra / 10.0) * 1.15}")
        6 -> println("Seu peso no planeta: ${(pterra / 10.0) * 1.17}")
        else -> println("Este planeta não pode ser analisado")
    }
}

// Algoritmo 90
fun alg90() {
    print("Digite número: ")
    val numero = readLine()!!.toDouble()
    if (numero > 20) {
        println(numero)
    }
}

// Algoritmo 91
fun alg91() {
    print("Digite 1º número: ")
    val num1 = readLine()!!.toInt()
    print("Digite 2º número: ")
    val num2 = readLine()!!.toInt()
    val soma = num1 + num2
    if (soma > 10) {
        println("Soma: $soma")
    }
}

// Algoritmo 92
fun alg92() {
    print("Digite 1º número: ")
    val num1 = readLine()!!.toDouble()
    print("Digite 2º número: ")
    val num2 = readLine()!!.toDouble()
    val soma = num1 + num2
    if (soma > 20) {
        println("Soma: ${soma + 8}")
    } else {
        println("Soma: ${soma - 5}")
    }
}

// Algoritmo 93
fun alg93() {
    print("Digite número: ")
    val numero = readLine()!!.toDouble()
    if (numero > 0) {
        println("Raiz: ${sqrt(numero)}")
    } else if (numero < 0) {
        println("Quadrado: ${numero.pow(2.0)}")
    }
}

// Algoritmo 94
fun alg94() {
    print("Digite número: ")
    val numero = readLine()!!.toInt()
    if (numero % 3 == 0) {
        println("Múltiplo de 3")
    } else {
        println("Não é múltiplo de 3")
    }
}

// Algoritmo 95
fun alg95() {
    print("Digite número: ")
    val numero = readLine()!!.toInt()
    if (numero % 5 == 0) {
        println("É divisível por 5")
    } else {
        println("Não é divisível por 5")
    }
}

// Algoritmo 96
fun alg96() {
    print("Digite número: ")
    val numero = readLine()!!.toInt()
    if (numero % 3 == 0 && numero % 7 == 0) {
        println("Divisível por 3 e por 7")
    } else {
        println("Não é divisível por 3 e por 7")
    }
}

// Algoritmo 97
fun alg97() {
    print("Digite número: ")
    val numero = readLine()!!.toInt()
    if (numero % 10 == 0) {
        println("Múltiplo de 10")
    } else if (numero % 2 == 0) {
        println("Múltiplo de 2")
    } else if (numero % 5 == 0) {
        println("Múltiplo de 5")
    } else {
        println("Não é múltiplo de 2 nem de 5")
    }
}

// Algoritmo 98
fun alg98() {
    print("Digite o salário: ")
    val sb = readLine()!!.toDouble()
    print("Digite o valor da prestação: ")
    val vp = readLine()!!.toDouble()
    if (vp <= 0.3 * sb) {
        println("Empréstimo concedido")
    } else {
        println("Empréstimo negado")
    }
}

// Algoritmo 99
fun alg99() {
    print("Número de 3 algarismos: ")
    val num = readLine()!!.toInt()
    val c = num / 100
    if (c % 2 == 0) {
        println("O algarismo das centenas é par: $c")
    } else {
        println("O algarismo das centenas é ímpar: $c")
    }
}

// Algoritmo 100
fun alg100() {
    print("Número de 4 algarismos: ")
    val num = readLine()!!.toInt()
    val c = (num % 10000) / 100
    if (c % 4 == 0) {
        println("O número $c é múltiplo de 4")
    } else {
        println("O número $c não é múltiplo de 4")
    }
}

// Algoritmo 101
fun alg101() {
    print("Digite número: ")
    val num = readLine()!!.toDouble()
    if (num > 20 && num < 90) {
        println("O número está na faixa de 20 a 90")
    } else {
        println("O número está fora da faixa de 20 a 90")
    }
}

// Algoritmo 102
fun alg102() {
    print("Digite número: ")
    val numero = readLine()!!.toDouble()
    if (numero > 20) {
        println("Maior que 20")
    } else if (numero < 20) {
        println("Menor que 20")
    } else {
        println("Igual a 20")
    }
}

// Algoritmo 103
fun alg103() {
    print("Entre com ano atual: ")
    val anoa = readLine()!!.toInt()
    print("Entre com ano de nascimento: ")
    val anon = readLine()!!.toInt()
    if (anon > anoa) {
        println("Ano de nascimento inválido")
    } else {
        println("Idade: ${anoa - anon}")
    }
}

// Algoritmo 104
fun alg104() {
    print("Digite nome: ")
    val nome = readLine()!!
    print("Digite sexo: ")
    val sexo = readLine()!!
    print("Digite idade: ")
    val idade = readLine()!!.toInt()
    if ((sexo == "F" || sexo == "f") && idade < 25) {
        println("$nome ACEITA")
    } else {
        println("$nome NÃO ACEITA")
    }
}

// Algoritmo 105
fun alg105() {
    print("Digite sigla: ")
    val sigla = readLine()!!
    if (sigla.equals("RJ", ignoreCase = true)) {
        println("carioca")
    } else if (sigla.equals("SP", ignoreCase = true)) {
        println("paulista")
    } else if (sigla.equals("MG", ignoreCase = true)) {
        println("mineiro")
    } else {
        println("outros estados")
    }
}

// Algoritmo 106
fun alg106() {
    print("Digite nome: ")
    val nome = readLine()!!
    val letra = nome.first().toString()
    if (letra.equals("A", ignoreCase = true)) {
        println(nome)
    }
}

// Algoritmo 107
fun alg107() {
    print("Digite nome: ")
    val nome = readLine()!!
    if (nome.take(4).equals("JOSÉ", ignoreCase = true) || nome.equals("JOSÉ", ignoreCase = true)) {
        println(nome)
    }
}

// Algoritmo 108
fun alg108() {
    print("Digite nome: ")
    val nome = readLine()!!
    val prenome = if (nome.length >= 5) nome.take(5) else nome
    if (prenome.trim().equals("JOSÉ", ignoreCase = true) || nome.equals("JOSÉ", ignoreCase = true)) {
        println(nome)
    }
}

// Algoritmo 109
fun alg109() {
    print("Digite 1º nome: ")
    val nome1 = readLine()!!
    print("Digite 2º nome: ")
    val nome2 = readLine()!!
    if (nome1 < nome2) {
        println("$nome1 $nome2")
    } else {
        println("$nome2 $nome1")
    }
}

// Algoritmo 110
fun alg110() {
    print("Digite 1º número: ")
    val a = readLine()!!.toDouble()
    print("Digite 2º número: ")
    val b = readLine()!!.toDouble()
    if (a == b) {
        println("Iguais")
    } else {
        println("Diferentes")
    }
}

// Algoritmo 111
fun alg111() {
    print("Digite 1º número: ")
    val a = readLine()!!.toDouble()
    print("Digite 2º número: ")
    val b = readLine()!!.toDouble()
    if (a > b) {
        println("Maior: $a")
    } else {
        println("Maior: $b")
    }
}

// Algoritmo 112
fun alg112() {
    print("Digite 1º número: ")
    val a = readLine()!!.toDouble()
    print("Digite 2º número: ")
    val b = readLine()!!.toDouble()
    if (a < b) {
        println("Menor: $a")
    } else {
        println("Menor: $b")
    }
}

// Algoritmo 113
fun alg113() {
    print("Digite 1º número: ")
    val a = readLine()!!.toDouble()
    print("Digite 2º número: ")
    val b = readLine()!!.toDouble()
    if (a < b) {
        println("$a $b")
    } else {
        println("$b $a")
    }
}

// Algoritmo 114
fun alg114() {
    print("Digite 1º número: ")
    val a = readLine()!!.toDouble()
    print("Digite 2º número: ")
    val b = readLine()!!.toDouble()
    if (a > b) {
        println("$a $b")
    } else {
        println("$b $a")
    }
}

// Algoritmo 115
fun alg115() {
    print("Digite valor de x: ")
    val x = readLine()!!.toDouble()
    print("Digite valor de y: ")
    val y = readLine()!!.toDouble()
    if (x > y) {
        println("${sqrt(x)}")
        println("${y.pow(2.0)}")
    } else if (y > x) {
        println("${sqrt(y)}")
        println("${x.pow(2.0)}")
    } else {
        println("Números iguais")
    }
}

// Algoritmo 116
fun alg116() {
    print("Digite 1º número: ")
    val a = readLine()!!.toDouble()
    print("Digite 2º número: ")
    val b = readLine()!!.toDouble()
    print("Digite 3º número: ")
    val c = readLine()!!.toDouble()
    if (a > b) {
        if (a > c) println("Maior: $a") else println("Maior: $c")
    } else {
        if (b > c) println("Maior: $b") else println("Maior: $c")
    }
}

// Algoritmo 117
fun alg117() {
    print("Digite 1º número: ")
    val a = readLine()!!.toDouble()
    print("Digite 2º número: ")
    val b = readLine()!!.toDouble()
    print("Digite 3º número: ")
    val c = readLine()!!.toDouble()
    var maior = a
    if (b > maior) maior = b
    if (c > maior) maior = c
    println("Maior: $maior")
}

// Algoritmo 118
fun alg118() {
    print("Digite 1º número: ")
    var a = readLine()!!.toDouble()
    print("Digite 2º número: ")
    var b = readLine()!!.toDouble()
    print("Digite 3º número: ")
    var c = readLine()!!.toDouble()
    var aux: Double
    if (a > b) { aux = a; a = b; b = aux }
    if (a > c) { aux = a; a = c; c = aux }
    if (b > c) { aux = b; b = c; c = aux }
    println("Ordem crescente: $a $b $c")
}

// Algoritmo 119
fun alg119() {
    print("Digite 1º número: ")
    var a = readLine()!!.toDouble()
    print("Digite 2º número: ")
    var b = readLine()!!.toDouble()
    print("Digite 3º número: ")
    var c = readLine()!!.toDouble()
    var aux: Double
    if (a > b) { aux = a; a = b; b = aux }
    if (a > c) { aux = a; a = c; c = aux }
    if (b > c) { aux = b; b = c; c = aux }
    println("Ordem decrescente: $c $b $a")
}

// Algoritmo 120
fun alg120() {
    print("Digite 1º número: ")
    var a = readLine()!!.toDouble()
    print("Digite 2º número: ")
    var b = readLine()!!.toDouble()
    print("Digite 3º número: ")
    var c = readLine()!!.toDouble()
    var aux: Double
    if (a > b) { aux = a; a = b; b = aux }
    if (a > c) { aux = a; a = c; c = aux }
    if (b > c) { aux = b; b = c; c = aux }
    val maior = c
    val intermediario = b
    val menor = a
    println("Maior: $maior")
    println("Intermediário: $intermediario")
    println("Menor: $menor")
}

// Algoritmo 121
fun alg121() {
    print("Digite 1º número: ")
    val n1 = readLine()!!.toInt()
    print("Digite 2º número: ")
    val n2 = readLine()!!.toInt()
    print("Digite 3º número: ")
    val n3 = readLine()!!.toInt()
    print("Digite 4º número: ")
    val n4 = readLine()!!.toInt()
    print("Digite 5º número: ")
    val n5 = readLine()!!.toInt()

    if (n1 != n2 && n1 != n3 && n1 != n4 && n1 != n5 &&
        n2 != n3 && n2 != n4 && n2 != n5 &&
        n3 != n4 && n3 != n5 && n4 != n5) {

        var maior: Int
        var menor: Int
        if (n1 > n2) {
            maior = n1
            menor = n2
        } else {
            maior = n2
            menor = n1
        }

        if (n3 > maior) maior = n3 else if (n3 < menor) menor = n3
        if (n4 > maior) maior = n4 else if (n4 < menor) menor = n4
        if (n5 > maior) maior = n5 else if (n5 < menor) menor = n5

        println("Maior = $maior")
        println("Menor = $menor")
    } else {
        println("Os valores devem ser diferentes")
    }
}

// Algoritmo 122
fun alg122() {
    print("Digite 1º lado: ")
    val a = readLine()!!.toDouble()
    print("Digite 2º lado: ")
    val b = readLine()!!.toDouble()
    print("Digite 3º lado: ")
    val c = readLine()!!.toDouble()
    if (a < b + c && b < a + c && c < a + b) {
        println("Podem ser lados de um triângulo")
    } else {
        println("Não podem ser lados de um triângulo")
    }
}

// Algoritmo 123
fun alg123() {
    print("Digite 1º lado: ")
    val a = readLine()!!.toDouble()
    print("Digite 2º lado: ")
    val b = readLine()!!.toDouble()
    print("Digite 3º lado: ")
    val c = readLine()!!.toDouble()
    if (a < b + c && b < a + c && c < a + b) {
        if (a == b && a == c) {
            println("Triângulo equilátero")
        } else if (a == b || a == c || b == c) {
            println("Triângulo isósceles")
        } else {
            println("Triângulo escaleno")
        }
    } else {
        println("As medidas não formam um triângulo")
    }
}

// Algoritmo 124
fun alg124() {
    print("Digite 1º lado: ")
    val a = readLine()!!.toDouble()
    print("Digite 2º lado: ")
    val b = readLine()!!.toDouble()
    print("Digite 3º lado: ")
    val c = readLine()!!.toDouble()
    if (a < b + c && b < a + c && c < a + b) {
        val maior: Double
        val lados: Double
        if (a > b && a > c) {
            maior = a.pow(2.0)
            lados = b.pow(2.0) + c.pow(2.0)
        } else if (b > c) {
            maior = b.pow(2.0)
            lados = a.pow(2.0) + c.pow(2.0)
        } else {
            maior = c.pow(2.0)
            lados = a.pow(2.0) + b.pow(2.0)
        }

        if (abs(maior - lados) < 0.0001) {
            println("Triângulo retângulo")
        } else if (maior > lados) {
            println("Triângulo obtusângulo")
        } else {
            println("Triângulo acutângulo")
        }
    } else {
        println("As medidas não formam um triângulo")
    }
}

// Algoritmo 125
fun alg125() {
    print("Digite sua idade: ")
    val idade = readLine()!!.toInt()
    if (idade >= 65) {
        println("Maior de 65")
    } else if (idade >= 18) {
        println("Maior de idade")
    } else {
        println("Menor de idade")
    }
}

// Algoritmo 126
fun alg126() {
    print("Digite valor de X: ")
    val x = readLine()!!.toDouble()
    if (x == 5.0) {
        println("O número é o 5")
    } else if (x == 200.0) {
        println("O número é o 200")
    } else if (x == 400.0) {
        println("O número é o 400")
    } else if (x in 500.0..1000.0) {
        println("Intervalo 500-1000")
    } else {
        println("Fora do escopo")
    }
}

// Algoritmo 127
fun alg127() {
    print("Digite nome: ")
    val nome = readLine()!!
    print("Digite 1ª nota: ")
    val nota1 = readLine()!!.toDouble()
    print("Digite 2ª nota: ")
    val nota2 = readLine()!!.toDouble()
    val media = (nota1 + nota2) / 2.0
    if (media >= 7.0) {
        println("$nome $media AP")
    } else if (media < 3.0) {
        println("$nome $media RP")
    } else {
        println("$nome $media PF")
    }
}

// Algoritmo 128
fun alg128() {
    print("Digite verbo: ")
    val verbo = readLine()!!
    val ultima = verbo.last().toString()
    if (ultima.equals("R", ignoreCase = true)) {
        val letra = verbo[verbo.length - 2].toString()
        if (letra.equals("A", ignoreCase = true)) {
            println("1ª conjugação")
        } else if (letra.equals("E", ignoreCase = true) || letra.equals("O", ignoreCase = true)) {
            println("2ª conjugação")
        } else if (letra.equals("I", ignoreCase = true)) {
            println("3ª conjugação")
        } else {
            println("Não existe verbo com essa terminação")
        }
    } else {
        println("Não é um verbo no infinitivo")
    }
}

// Algoritmo 129
fun alg129() {
    print("Digite salário: ")
    val salario = readLine()!!.toDouble()
    val desconto: Double = if (salario <= 600) {
        0.0
    } else if (salario <= 1200) {
        salario * 0.20
    } else if (salario <= 2000) {
        salario * 0.25
    } else {
        salario * 0.30
    }
    println("Desconto: $desconto")
}

// Algoritmo 130
fun alg130() {
    print("Digite valor do produto: ")
    val valor = readLine()!!.toDouble()
    if (valor < 20) {
        println("Valor de venda: ${valor * 1.45}")
    } else {
        println("Valor de venda: ${valor * 1.30}")
    }
}
