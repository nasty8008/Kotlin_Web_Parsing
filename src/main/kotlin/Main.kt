import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

fun main() {

    val siteURL = "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"

    val doc: Document = Jsoup.connect(siteURL).get()

    val quotes: Elements = doc.select("article div div div")

    for (quote: Element in quotes) {
        println("${quote.text()}\n")
    }
}