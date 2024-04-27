# gioco-testuale
Il gioco si compone di 3 livelli, ognuno con un rispettivo nemico.
Si può scegliere all'inizio tra 3 personaggi: mago guerriero o ladro (ognuno con le proprie caratteristiche).

In ogni turno il giocatore può decidere se attaccare o se usare l'abilità speciale o se aumentare la propria energia sacrificando la salute, 
a seguire attaccherà il nemico.
L'abilità speciale verrà definita in seguito in merito alla presentazione dei personaggi.
Quando un personaggio attacca si dovrà premere invio per lanciare un dado a 4 facce, in base al numero uscito sarà diversa l'entità del danno.
Il danno è anche proporzionale al livello (progressivo) perchè aumenta anche la salute dei nemici nei vari livelli.
Quando si sceglie la terza opzione si diminuisce la salute del proprio personaggio di 10 punti per aumentare l'energia di 10 punti.
Quando attacca il nemico anche questo lancerà un dado a 4 facce per definire l'entità del danno, il giocatore ha la possibilità di difendersi.
Anche per la difesa si lancerà un dado che determinerà lo "scudo", il danno finale inflitto dal nemico sarà pari a danno iniziale meno lo scudo.

Si supera un livello se il nemico termina la propria salute, quando il terzo nemico viene sconfitto si vince il gioco.
Si perde se si termina la salute del proprio giocatore.

Il giocatore dispone di salute e energia (i valori dipendono dal personaggio), il nemico solo di salute e ha energia infinita.
Al superamento di un livello salute e energia vengono aumentati di un valore che dipende da un estrazione casuale tra 40 e 100.

Ogni attacco costa 10 punti energia, 
ogni abilità speciale 50 punti energia,
ogni difesa 10 punti energia.

# PERSONAGGI:

- mago = salute:60, energia=100
        attacco da 10*liv a 40*liv
        difesa da 10*liv a 40*liv
        abilità speciale: +50 salute

- guerriero = salute:80, energia: 80
        attacco da 10*liv a 40*liv
        difesa da 10*liv a 40*liv
        abilità speciale: attacco x2, quindi da 20*liv a 80*liv

- ladro = salute:70, energia:90
        attacco da 10*liv a 40*liv
        difesa da 20*liv a 50*liv
        abilità speciale: all'attacco seguente del nemico, questo si infliggerà danno da solo

# NEMICI:

- nemico1 = 100 salute
	    attacco da 10 a 40

- nemico2 = 150 salute
	    attacco da 20 a 50

- nemico3 = 200 salute
	    attacco da 30 a 60







