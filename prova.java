//CONSEGNA

/*
1) COSTRUIRE UN XML FACENDO INSERIRE I DATI ALL'UTENTE
Tradotto
1)

root> create "node"
root/node> create "mario"

"create" => function()

map<String, Method>

root>create
	name: aldkals
root/aldkals>add-attributes
	name: surname
	value: soave

map.get("create").invoke("mario");

2) LEGGO L'XML E LO SALVO IN JSON (FACENDO LE OPPORTUNE CONSIDERAZIONI). LEGGO IL JSON E LO STAMPO A VIDEO (MANTENTENDO TUTTE LE INFORMAZIONI)


<root>
	<father name="mario">
		<child>

		</child>
	</father>
</root>

{
	'father': {
		"-name"
	}
}


						X
					X
*/

public class Nodo{
	Nodo padre;
	Map<String, Nodo> childs;
	Map<String,String> attributes;

	public Nodo addchild(String value){

	}

	public void addAtt(String key, Strig value){
		attributes.put(key,value);
	}

}


public class App {

 	Nodo current;

	boolean isNode = true;



	Map<String, Runnable> commands = new HashMap<>(){{
		put("create", () -> {
			//crea un nuovo nodo
			if(isNode){
				current.addChild("mario");
			}else{
				current.addAtt("surname", "soave");
			}
		});
		put("del", () -> {
			//elimina il nodo selezionato o i suoi attributi
		});
		put("child", () ->{
			// aggiunge un figlio al nodo selezionato
		});
		put("node", () ->{
			//aggiunge attributi al nodo selezionato
			isNode = true;
		});
		put("att", () ->{
			//aggiunge attributi al nodo selezionato
			isNode = false;
		});
		put("back", () ->{
			// torna al nodo precedente
		});
		put("select", () ->{
			//seleziona un figlio del padre in base al nodo
		});
	}};



	public static void main(String[] args) {
		commands.)
	}

}
