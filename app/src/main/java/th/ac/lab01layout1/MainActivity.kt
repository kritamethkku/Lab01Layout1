package th.ac.lab01layout1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import th.ac.lab01layout1.ui.theme.Lab01Layout1Theme

data class Person(
    val name: String,
    val studentID: String,
    val imageID: Int
)

class MainActivity : ComponentActivity() {
    var persons: List<Person> = listOf(
        Person("Peter Griffin", "001", R.drawable.peter_guy),
        Person("Lois Griffin", "002", R.drawable.lois),
        Person("Meg Griffin", "003", R.drawable.meg),
        Person("Stewie Griffin", "004", R.drawable.stewie),
        Person("Chris Griffin", "005", R.drawable.chris),
        Person("Brian Griffin", "006", R.drawable.brian),
        Person("Glenn Quagmire", "007", R.drawable.glenn),
        Person("Joe Swanson", "008", R.drawable.joe),
        Person("John Herbert", "009", R.drawable.herbert),
        Person("Cleveland Brown", "010", R.drawable.cleveland),
        Person("Bonnie Swanson", "011", R.drawable.bonnie),
        Person("Adam West", "012", R.drawable.adamwest),
        Person("Tricia Takanawa", "013", R.drawable.triciatakanawa),
        Person("Tomik", "014", R.drawable.tomik),
        Person("Carter Pewterschmidt", "015", R.drawable.carter),
        Person("Miss Tammy", "016", R.drawable.tammy),
        Person("Homer Simpson", "017", R.drawable.homersimpson),
        Person("Bartholomew Simpson", "018", R.drawable.bart),
        Person("Weepinbell", "019", R.drawable.weepinbell),
        Person("Bulbasaur", "020", R.drawable.bulbasaur),
        Person("Venusaur", "021", R.drawable.venusaur),
        Person("Charizard", "022", R.drawable.charizard),
        Person("Butterfree", "023", R.drawable.butterfree),
        Person("Beedrill", "024", R.drawable.beedrill),
        Person("Pidgeot", "025", R.drawable.pidgeot),
        Person("Raticate", "026", R.drawable.raticate),
        Person("Arbok", "027", R.drawable.arbok),
        Person("Raichu", "028", R.drawable.raichu),
        Person("Sandshrew", "029", R.drawable.sandshrew),
        Person("Sandslash", "030", R.drawable.sandslash),
        Person("Nidoqueen", "031", R.drawable.nidoqueen),
        Person("Nidoking", "032", R.drawable.nidoking),
        Person("Clefable", "033", R.drawable.clefable),
        Person("Vulpix", "034", R.drawable.vulpix),
        Person("Ninetales", "035", R.drawable.ninetales),
        Person("Wigglytuff", "036", R.drawable.wigglytuff),
        Person("Golbat", "037", R.drawable.golbat),
        Person("Vileplume", "038", R.drawable.vileplume),
        Person("Parasect", "039", R.drawable.parasect),
        Person("Venonat", "040", R.drawable.venonat),
        Person("Dugtrio", "041", R.drawable.dugtrio),
        Person("Meowth", "042", R.drawable.meowth),
        Person("Persian", "043", R.drawable.persian),
        Person("Golduck", "044", R.drawable.golduck),
        Person("Primeape", "045", R.drawable.primeape),
        Person("Growlithe", "046", R.drawable.growlithe),
        Person("Arcanine", "047", R.drawable.arcanine),
        Person("Poliwrath", "048", R.drawable.poliwrath),
        Person("Alakazam", "049", R.drawable.alakazam),
        Person("Machamp", "050", R.drawable.machamp),





    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab01Layout1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column {
                        TopAppBar(
                            title = {
                                Text(
                                    text = "Name List",
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    text = "ผมไม่มีข้อมูลของน้องๆนะครับ จะใช้เป็นข้อมูลที่กำหนดเองจำนวน 50 เรคคอร์ดครับ",
                                    style = MaterialTheme.typography.subtitle1
                                )
                            },
                            actions = {
                                // Add any actions here if needed
                            }
                        )
                        LazyColumn {
                            items(persons.sortedBy { it.studentID }) { person ->
                                PersonListItem(data = person)
                                Divider(modifier = Modifier.padding(horizontal = 16.dp),)
                            }
                        }
                }
            }
        }
    }
}

@Composable
fun PersonListItem(data: Person) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = data.imageID),
            contentDescription = data.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(text = data.name)
            Text(text = data.studentID)
        }
    }
}}
