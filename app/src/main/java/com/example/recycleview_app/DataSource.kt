package com.example.recycleview_app

import com.example.recycleview_app.models.BlogPost
import kotlin.random.Random

class DataSource {


  companion object {

    fun createDataSet(): List<BlogPost> {
      var count = 0;
      val names = arrayOf("Hajnal", "Lokman", "Cynthia", "Linda", "Tim", "Nisha", "Luis", "Κλεομήδης", "Jérémy", "Zina", "Marian", "Florian", "Rodica", "Subash", "Vladimir", "Marcela", "Stian", "Đỗ", "Renata", "Ludovica", "Николай", "Klaudia", "Hernán", "Margaux", "Shruti", "Felix", "Caitlyn", "Marioara", "Elliot", "Salih", "Móric", "Lidia", "Noah", "Lukács", "Αγαμήδης", "Zoltán", "Martin", "Александр", "Filofteia", "Fejes", "Ellen", "Sava", "Minahil", "Phan", "Ερυσίχθονας", "Yogesh", "Jarolím", "Clara", "Erwan", "Leon")
      val titles = arrayOf("Bacon ipsum dolor amet turducken pork belly biltong, beef ribs shankle buffalo pork cow.", "Sausage ribeye porchetta leberkas, pancetta drumstick short ribs doner turducken filet mignon ground round ham hock tongue.", "Meatloaf chicken turkey picanha fatback pig tail pork belly alcatra.", "Sausage pastrami beef corned beef meatball.", "Corned beef flank chicken, andouille shank frankfurter spare ribs shankle bresaola.", "Biltong spare ribs bacon brisket ground round.", "Flank spare ribs turkey fatback beef ribs turducken.", "Frankfurter shank leberkas turkey, meatball pork loin cow tail biltong salami landjaeger sausage tri-tip.", "Beef ribs pancetta pork loin, drumstick ham hock alcatra venison.", "Rump kevin kielbasa sausage, shank landjaeger drumstick pancetta hamburger chicken pig chuck swine pork loin.", "Pig picanha rump cupim pastrami strip steak venison tenderloin pancetta ham hock ball tip alcatra chicken filet mignon salami.", "Tongue spare ribs ham ham hock porchetta.", "Meatball pig frankfurter, sausage filet mignon salami bacon turkey chuck cupim corned beef.", "Capicola pork loin tongue tail, strip steak shank t-bone sausage fatback cupim spare ribs.", "Hamburger shank biltong kielbasa capicola, shankle pork loin tail prosciutto filet mignon chuck venison.", "Prosciutto venison bacon ribeye jowl alcatra.", "Meatball corned beef spare ribs chicken chuck jowl tenderloin tongue.", "Landjaeger short loin doner flank tri-tip frankfurter beef kevin alcatra.", "Salami andouille pork chop drumstick.", "Chuck bacon biltong, shoulder prosciutto kielbasa pork belly turkey venison.")
      val body = "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Culpa cumque doloribus dolorum exercitationem facere fuga inventore, magnam maiores minus odio perspiciatis quia sapiente sed sint voluptatem? Error esse quos ullam."
      val url = { id: Int -> "https://picsum.photos/id/$id/800/500" }
      val title = { titles.get(Random.nextInt(0, titles.size))}
      val username = { names.get(Random.nextInt(0, names.size)) }
      return (120..1000).map { BlogPost(count++, title(), body, url(it), username()) }
    }
  }
}