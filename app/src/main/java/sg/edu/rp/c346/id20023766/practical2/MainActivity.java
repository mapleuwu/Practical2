// Foo Wei Hong, 20023766
package sg.edu.rp.c346.id20023766.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    TextView tv6;
    TextView tv7;
    TextView tv8;
    TextView tv9;
    TextView tv10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.axltext);
        tv2 = findViewById(R.id.anttext);
        tv3 = findViewById(R.id.wolftext);
        tv4 = findViewById(R.id.alpacatext);
        tv5 = findViewById(R.id.alligatortext);
        tv6 = findViewById(R.id.beartext);
        tv7 = findViewById(R.id.beagletext);
        tv8 = findViewById(R.id.brtext);
        tv9 = findViewById(R.id.bwstext);
        tv10 = findViewById(R.id.butterflytext);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("TitleName","AXOLOTL");
                intent.putExtra("resId", R.drawable.axl);
                intent.putExtra("description", "Axolotls are often referred to as “Mexican walking fish,” but they are actually amphibians that prefer to live their entire lives underwater. These remarkable creatures can regenerate almost every part of their bodies if necessary, including their spines, internal organs and even some parts of their brains. They have a very unique appearance and are extremely popular as exotic pets, but they can also be found in captivity at zoos, laboratories and breeding facilities. There are almost none of these creatures left in the wild.");
                intent.putExtra("facts", "•Axolotls can regenerate their limbs as well as their spines, brains and nearly every other body part.\n" + "•They exhibit neoteny, which means that they never outgrow their juvenile characteristics like other salamanders. For example, they have both gills and lungs.\n" + "•The name “axolotl” means “water monster.”\n" + "•They are commonly called “Mexican walking fish” even though they are not fish at all.");
                intent.putExtra("urllink", "https://a-z-animals.com/animals/axolotl/");
                startActivity(intent);
            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("TitleName","ANT");
                intent.putExtra("resId", R.drawable.ant);
                intent.putExtra("description", "The ant is a small-sized invertebrate that is found all around the world, with the exception of the polar regions including the Arctic Circle and Antarctica. As with many other species of insect, there are numerous ant species inhabiting many different environments all around the world.");
                intent.putExtra("facts", "•There is a species of ants found nowhere else on Earth except for between 63rd and 76th streets in New York. Its name: ManhattAnt.\n" + "•More than 300 spider species have evolved to disguise themselves as ants as a predatory technique.\n" + "•There is a single “super ant colony” that stretches 3,700 miles along the Mediterranean coast.");
                intent.putExtra("urllink", "https://a-z-animals.com/animals/ant/");
                startActivity(intent);
            }
        });

        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("TitleName","ARCTIC WOLF");
                intent.putExtra("resId", R.drawable.wolf);
                intent.putExtra("description", "Arctic wolves live in Greenland, Alaska, Iceland and Canada. But, these wolves live in caves and not dens like other types of wolves. Their short noses and small ears help to maintain their body heat on the tundra. The territory traveled by an Arctic wolf can add up to hundreds of miles.");
                intent.putExtra("facts", "•These wolves travel in groups or packs of about six\n" + "• They live about 7 years in the wild\n" + "• They have a thick, white coat that’s insulated against very cold temperatures\n" + "• Wolf pups are born with blue irises that change to a yellow/gold as they grow older");
                intent.putExtra("urllink", "https://a-z-animals.com/animals/arctic-wolf/");
                startActivity(intent);
            }
        });

        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("TitleName","ALPACA");
                intent.putExtra("resId", R.drawable.alpaca);
                intent.putExtra("description", "The alpaca is a camelid mammal native to South America.Closely related to its larger cousin, the llama, the two species are able to interbreed. Yarn spun from alpaca wool is popular for warm, soft sweaters, socks, mittens, and hats, making the fur of these domesticated animals a valuable commodity.");
                intent.putExtra("facts", "•The ancient Incas first domesticated the alpaca more than 6,000 years ago. They made robes of alpaca fur for the nobles and royalty.\n" + "•Alpacas’ stomachs have three chambers.\n" + "•The single alpaca species has two breeds: the dreadlocked suri and the fluffy huacaya.\n" + "•Most of the noise alpacas make is humming. Depending on the situation, this expresses contentment, curiosity, boredom, caution or distress.\n" + "•When llamas cross breed with alpacas, the baby is called a huarizo.");
                intent.putExtra("urllink", "https://a-z-animals.com/animals/alpaca/");
                startActivity(intent);
            }
        });

        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("TitleName","ALLIGATOR");
                intent.putExtra("resId", R.drawable.alligator);
                intent.putExtra("description", "An alligator is a crocodilian in the genus Alligator of the family Alligatoridae. The two extant species are the American alligator and the Chinese alligator. Additionally, several extinct species of alligator are known from fossil remains.");
                intent.putExtra("facts", "•Alligators are toothy.\n" + "•Alligators continue to grow throughout their lifetimes.\n" + "•They can use tools.\n" + "•Alligators have two kinds of walks.\n" + "•Alligators are ecosystem engineers.\n" + "•Alligators are apex predators that also eat fruit.");
                intent.putExtra("urllink", "https://a-z-animals.com/animals/alligator/");
                startActivity(intent);
            }
        });

        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("TitleName","BEAR");
                intent.putExtra("resId", R.drawable.bear);
                intent.putExtra("description", "There are eight different species of bears across the world with a conservation status ranging from vulnerable to least concern. Depending on the bear species, habitats include North America, South America, Europe, Asia, and the northern-most polar regions. While not ordinarily a threat to humans, bears are animals that can be very dangerous if startled, provoked, or approached when young bears (cubs) are present.");
                intent.putExtra("facts", "•While considered a carnivorous species, most bears eat vegetation as their primary food source.\n" + "•Bears are animals that will fight to the death for family members.\n" + "•Many bear experts believe bears can smell from up to 20 miles away.");
                intent.putExtra("urllink", "https://a-z-animals.com/animals/bear/");
                startActivity(intent);
            }
        });

        tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("TitleName","BEAGLE");
                intent.putExtra("resId", R.drawable.beagle);
                intent.putExtra("description", "The history of the beagle is believed to date all the way back to 5th century Greece. These dogs hunted alongside their owners in search of foxes, rabbits, and other small prey. In the 1500s, beagles became well-known in England as they traveled out in packs with English gentlemen in search of deer, rabbits, and foxes. This dog’s persistence, excellent sense of smell and loud howling bark made it a helpful companion for hunters.");
                intent.putExtra("facts", "•Small, compact, and hardy, Beagles are active companions for kids and adults alike.\n" + "•Canines of this dog breed are merry and fun loving, but being hounds, they can also be stubborn and require patience, creative training techniques.");
                intent.putExtra("urllink", "https://a-z-animals.com/animals/beagle/");
                startActivity(intent);
            }
        });

        tv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("TitleName","BLACK RHINOCEROS");
                intent.putExtra("resId", R.drawable.br);
                intent.putExtra("description", "The black rhino once roamed across a vast range in Africa, but heavy poaching has brought the species to the brink of extinction. Today, the black rhino is seeing its population rebound and is slowly being reintroduced to countries and environments the species vanished from in recent decades. ");
                intent.putExtra("facts", "•Although critically endangered, black rhino populations have rebounded since hitting a low of just an estimated 2,475 individuals in 1993.\n" + "•The San Diego Zoo reports the black rhino can hit 40 miles per hour (64 km/hr), making it one of the fastest large animals on Earth!\n" + "•While black rhino populations are rebounding, the Western black rhino subspecies was declared extinct in 2011");
                intent.putExtra("urllink", "https://a-z-animals.com/animals/axolotl/");
                startActivity(intent);
            }
        });

        tv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("TitleName","BLACK WIDOW");
                intent.putExtra("resId", R.drawable.bws);
                intent.putExtra("description", "Their reputations are fierce, but in reality, black widow spiders — aka Latrodectus — are calm, loner pacifists that only unleash venomous bites when they’ve exhausted all other defensive options. Thirty-two species of the infamous arachnids populate the Earth on every continent except Antarctica, and the genus probably popped onto the world scene about 300 million years ago.Female black widows carry large loads of venom, but males don’t. And though it’s widely believed that all females eat their mates after breeding, such behavior is rare and only happens in lab environments where there’s no escape.");
                intent.putExtra("facts", "•The strength of black widows’ webs are comparatively stronger than steel! Scientists actively study the spider’s weaving silks in the hopes of replicating it for infrastructure projects, like bridges!\n" + "•At first glance, spiders in the genus Steatoda resemble widow spiders, which is how they got the nickname “false widow spiders.” Steatoda bites aren’t pleasant, but they’re not as destructive as black widow bites.\n" + "•Latrodectus tredecimguttatus is the most deadly of all 32 widow species.\n" + "•Black widow spiders don’t live long lives. Males typically expire in months, and only a smattering of lucky females make it to the ripe old age of three.");
                intent.putExtra("urllink", "https://a-z-animals.com/animals/black-widow-spider/");
                startActivity(intent);
            }
        });

        tv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("TitleName","BUTTERFLY");
                intent.putExtra("resId", R.drawable.butterfly);
                intent.putExtra("description", "The butterfly can be found in most countries in the world, but there tend to be more butterflies in warmer climates. The butterfly is a type of insect that feeds on flower nectar through its long and curled straw-like tongue.Butterflies are similar in appearance and tendencies to moths, with many species of butterfly often getting confused as a moth and moths with butterflies. In general, the butterfly species tend to be more brightly coloured than the moth species, but there are exceptions.The butterfly’s most reputable characteristic is the fact that there is an incredible morphing process, during the life cycle of the butterfly. The butterfly starts life as a caterpillar, which cocoons itself in a silky thread. The caterpillar emerges from its time in the pod, with colourful wings.");
                intent.putExtra("facts", "•Butterfly wings are transparent.\n" + "•There are almost 20,000 butterfly species.\n" + "•Butterflies use their feet to taste.\n" + "•Butterflies only live for a few weeks.");
                intent.putExtra("urllink", "https://a-z-animals.com/animals/butterfly/");
                startActivity(intent);
            }
        });

    }
}