## Altici - Java/Quakus
 - Felipe Silva - https://www.linkedin.com/in/felipe-silva-b7127a160/


Teste alticci feito em Java usando framework Quakus

# Sequencia Alticci a(n) é definida como:
- Para n = 0, a(0) = 0
- Para n = 1, a(1) = 1
- Para n = 2, a(2) = 1
- Para n > 2, a(n) = a(n-3) + a(n-2)

# Exemplo de saída:

| n |   |   |   |a(n)|
|---|---|---|---|---|
|1  |   |   |   | 0 |
|2  |   |   |   | 1 |
|3  |   |   |   | 1 |
|4  |   |   |   | 1 |
|5  |   |   |   | 2 |
|6  |   |   |   | 2 |
|7  |   |   |   | 3 |
|8  |   |   |   | 4 |
|9  |   |   |   | 5 |
|10 |   |   |   | 7 |
|11 |   |   |   | 9 |

# Execução

Obs.: O desenvolvimento e execução desse projeto foi feito no Linux Ubuntu 22.04 LTS. Este passo-a-passo de execução pode não funcionar integralmente em distros não baseadas em Debian (Fedora, Arch, CentOS, etc);

### Requisitos:
- Instalação do cliente do Framework Quakus.
[Quarkus client](https://quarkus.io/guides/cli-tooling#:~:text=Scoop-,The,-Quarkus%20CLI%20is)
- Instalação do Docker.
[Docker install](https://docs.docker.com/engine/install/ubuntu/#:~:text=from%20the%20repository.-,Set%20up%20the%20repository,-Update%20the%20apt)

