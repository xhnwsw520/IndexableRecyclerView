package com.cuiwei.android.indexablelistview;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SectionIndexer;
import android.widget.TextView;

import com.cuiwei.android.util.StringMatcher;
import com.cuiwei.android.widget.IndexableRecyclerView;

public class IndexableRecyclerViewActivity extends Activity {

	private IndexableRecyclerView mRecyclerView;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        String[] datas = {"Aaron","Abdul","Abdullah","Abe","Abel","Abraham","Abram","Abriel","Ace","Adam"
                ,"Adan","Addison","Ade","Aden","Adnan","Adonis","Adrian","Adriel","Ahmad","Ahmed"
                ,"Aidan","Aiden","Ainsley","Ajay","Al","Alain","Alan","Alaric","Alastair","Albany"
                ,"Albert","Alberto","Albie","Albus","Alden","Aldo","Aldric","Aldrin","Alec","Aled"
                ,"Alejandro","Alen","Alesandro","Alex","Alexander","Alexis","Alfie","Alfonse","Alfonso","Alfred"
                ,"Alfredo","Ali","Alistair","Allan","Allen","Alonzo","Aloysius","Alphonso","Alton","Alvin"
                ,"Amari","Ambrose","Amir","Amit","Amos","Anand","Anderson","Andre","Andreas","Andres"
                ,"Andrew","Andy","Angel","Angelo","Angus","Ansel","Anson","Anthony","Anton","Antonio"
                ,"Antony","Apollo","Aran","Archer","Archibald","Archie","Ari","Arjun","Arlo","Arman"
                ,"Armando","Arnie","Arnold","Aron","Arran","Arrie","Art","Arthur","Arturo","Arun"
                ,"Arwin","Asa","Asad","Ash","Ashby","Asher","Ashley","Ashton","Ashwin","Aspen"
                ,"Aston","Aswin","Athan","Atticus","Aubrey","Auden","Audric","Audwin","August","Augustus"
                ,"Austen","Austin","Aven","Avery","Avon","Axel","Ayaan","Ayden","Bailey","Barack"
                ,"Barclay","Barnaby","Barney","Barrett","Barron","Barry","Bart","Bartholomew","Basil","Bastian"
                ,"Baxter","Bay","Baylor","Bear","Beau","Beck","Beckett","Bellamy","Ben","Benedict"
                ,"Benjamin","Benji","Benjy","Bennett","Bennie","Benny","Benson","Bentley","Bently","Benton"
                ,"Bernard","Bernardo","Bernie","Bert","Bertie","Bertram","Bev","Bevan","Bevin","Bevis"
                ,"Bill","Billy","Bjorn","Bladen","Blain","Blaine","Blair","Blaise","Blake","Blaze"
                ,"Blue","Bob","Bobby","Bodie","Bogdan","Boris","Boston","Bowen","Boyd","Brad"
                ,"Braden","Bradford","Bradley","Bradwin","Brady","Braeden","Bram","Branden","Brandon","Brantley"
                ,"Braxton","Bray","Brayan","Brayden","Braydon","Braylon","Brayson","Breck","Breckin","Brendan"
                ,"Brenden","Brendon","Brennan","Brennon","Brent","Brentley","Brenton","Bret","Brett","Brevin"
                ,"Brevyn","Brian","Brice","Bridie","Brie","Brig","Brighton","Brinley","Brock","Brod"
                ,"Broderick","Brodie","Brody","Brogan","Bronson","Brook","Brooke","Brooklyn","Brooks","Bruce"
                ,"Bruno","Bryan","Bryant","Bryce","Bryden","Brydon","Bryn","Bryon","Bryson","Buck"
                ,"Buddy","Burt","Burton","Buster","Butch","Byron","Cadby","Cade","Caden","Cael"
                ,"Caelan","Caesar","Cai","Caiden","Cain","Caius","Cal","Cale","Caleb","Calhoun"
                ,"Callan","Callen","Callum","Calum","Calvin","Cam","Camden","Cameron","Campbell","Camron"
                ,"Carey","Carl","Carlisle","Carlos","Carlton","Carsen","Carson","Carsten","Carter","Cary"
                ,"Casey","Cash","Cason","Casper","Cassius","Castiel","Castor","Cathal","Cato","Cavan"
                ,"Cayden","Caydon","Cayson","Cecil","Cedric","Cesar","Chad","Chance","Chandler","Channing"
                ,"Charles","Charley","Charlie","Charlton","Chas","Chase","Chauncey","Chayton","Chaz","Che"
                ,"Chesney","Chester","Chevy","Chip","Chris","Christian","Christopher","Chuck","Cian","Ciaran"
                ,"Cillian","Clancy","Clarence","Clark","Claude","Clay","Clayton","Clement","Cletus","Cliff"
                ,"Clifford","Clifton","Clint","Clinton","Clive","Clovis","Clyde","Coby","Cody","Cohen"
                ,"Colby","Cole","Colin","Collin","Colm","Colt","Colten","Colton","Conan","Conlan"
                ,"Conner","Connor","Conor","Conrad","Constantine","Cooper","Corbin","Corey","Cormac","Cornelius"
                ,"Cory","Craig","Crispin","Cristian","Cristobal","Crosby","Cruz","Cullen","Curt","Curtis"
                ,"Cuthbert","Cyril","Cyrus","Dacey","Daire","Dakota","Dale","Dalen","Dallas","Dalon"
                ,"Dalton","Damian","Damien","Damion","Damon","Dan","Dana","Dane","Daniel","Danny"
                ,"Dante","Dara","Daragh","Darcy","Daren","Darian","Darin","Dario","Darius","Darnell"
                ,"Darragh","Darrel","Darrell","Darren","Darrin","Darryl","Darryn","Darwin","Daryl","Dash"
                ,"Dashawn","Dave","David","Davin","Davion","Davis","Dawson","Dax","Daxon","Daxter"
                ,"Daxton","Daylen","Dayton","Deacon","Dean","Deandre","Declan","Deepak","Delbert","Delvin"
                ,"Demetrius","Denis","Dennis","Denny","Denver","Denzel","Deon","Derek","Derik","Dermot"
                ,"Derrick","Deshaun","Deshawn","Desmond","Dev","Devin","Devlin","Devon","Devyn","Dewayne"
                ,"Dewey","Dexter","Diarmuid","Dick","Dicky","Diego","Digby","Dilan","Dillon","Dimitri"
                ,"Dinesh","Dino","Dion","Dirk","Dixon","Django","Dmitri","Dominic","Dominick","Don"
                ,"Donal","Donald","Donnie","Donovan","Dorian","Doug","Dougie","Douglas","Doyle","Drake"
                ,"Draven","Drew","Duane","Dudley","Duke","Duncan","Dustin","Dwayne","Dwight","Dylan"
                ,"Eamon","Earl","Earnest","Eason","Easton","Ed","Eddie","Eddy","Eden","Edgar"
                ,"Edison","Edmund","Edouard","Edric","Edsel","Eduardo","Edward","Edwardo","Edwin","Efrain"
                ,"Efren","Egan","Egon","Eli","Elian","Elias","Elijah","Eliot","Elisha","Ellington"
                ,"Elliot","Elliott","Ellis","Elmer","Elmo","Elon","Elroy","Elton","Elvis","Elwood"
                ,"Elwyn","Ely","Emanuel","Emerson","Emery","Emet","Emil","Emiliano","Emilio","Emlyn"
                ,"Emmanuel","Emmerson","Emmet","Emmett","Emory","Ennio","Enoch","Enrique","Enzo","Eoghan"
                ,"Eoin","Eric","Erick","Erik","Ernest","Ernesto","Ernie","Errol","Ervin","Erwin"
                ,"Esteban","Ethan","Ethen","Etienne","Euan","Euen","Eugene","Eustace","Evan","Evangelos"
                ,"Evelyn","Everett","Ewan","Eyan","Ezekiel","Ezio","Ezra","Fabian","Fabio","Faisal"
                ,"Farley","Febian","Felipe","Felix","Fenton","Ferdinand","Fergal","Fergus","Fernand","Fernando"
                ,"Fidel","Finbar","Finlay","Finley","Finn","Finnian","Finnigan","Fionn","Fletcher","Florian"
                ,"Floyd","Flynn","Ford","Forest","Forrest","Foster","Fox","Francesco","Francis","Francisco"
                ,"Frank","Frankie","Franklin","Franklyn","Fraser","Fred","Freddie","Freddy","Frederick","Fredrick"
                ,"Fritz","Fynn","Gabe","Gabriel","Gael","Gaelan","Gage","Gale","Galen","Gannon"
                ,"Gareth","Garman","Garrett","Garrison","Garry","Garth","Gary","Gaston","Gavin","Gene"
                ,"Geoff","Geoffrey","George","Geraint","Gerald","Gerard","Gerardo","Germain","Gerry","Gian"
                ,"Gibson","Gideon","Gil","Gilbert","Gilberto","Giles","Gino","Giorgio","Giovanni","Glen"
                ,"Glenn","Glyndwr","Glynn","Godfrey","Godric","Godwin","Gonzalo","Gordon","Grady","Graeme"
                ,"Graham","Granger","Grant","Gray","Grayson","Greg","Gregg","Gregor","Gregory","Grey"
                ,"Greyson","Griffin","Grover","Guillermo","Gunnar","Gunner","Gus","Gustav","Gustavo","Guy"
                ,"Gwain","Haden","Haiden","Hal","Hamilton","Hamish","Han","Hank","Hans","Harlan"
                ,"Harley","Harold","Harris","Harrison","Harry","Harvey","Hassan","Hayden","Hayes","Heath"
                ,"Hector","Hendrik","Hendrix","Henley","Henri","Henry","Herbert","Herbie","Herman","Heston"
                ,"Hilary","Holden","Homer","Horace","Horatio","Howard","Hubert","Huck","Hudson","Huey"
                ,"Hugh","Hugo","Humberto","Humphrey","Hunter","Huw","Hywel","Iain","Ian","Ianto"
                ,"Ibrahim","Ichabod","Idris","Ieuan","Ieystn","Iggy","Ignacio","Igor","Ike","Imran"
                ,"Indiana","Inigo","Ira","Irvin","Irving","Irwin","Isaac","Isaiah","Isaias","Ishaan"
                ,"Ishmael","Isiah","Isidore","Ismael","Israel","Issac","Ivan","Ivor","Jace","Jack"
                ,"Jackie","Jackson","Jacob","Jacoby","Jacques","Jad","Jaden","Jadon","Jagger","Jago"
                ,"Jai","Jaiden","Jaime","Jak","Jake","Jakob","Jalen","Jamal","James","Jameson"
                ,"Jamie","Jamison","Jan","Jared","Jaret","Jariel","Jarod","Jaron","Jarrett","Jarrod"
                ,"Jarvis","Jase","Jason","Jasper","Javid","Javier","Javon","Jax","Jaxon","Jaxson"
                ,"Jay","Jayce","Jayden","Jaydon","Jaylen","Jaylin","Jaylon","Jayson","Jeb","Jebediah"
                ,"Jed","Jedediah","Jediah","Jedidiah","Jeff","Jefferson","Jeffery","Jeffrey","Jeffry","Jem"
                ,"Jensen","Jenson","Jerald","Jeremiah","Jeremy","Jericho","Jermaine","Jerome","Jerrion","Jerrold"
                ,"Jerry","Jersey","Jesse","Jessie","Jesus","Jet","Jethro","Jett","Jevan","Jim"
                ,"Jimmie","Jimmy","Joachim","Joaquin","Jock","Jody","Joe","Joel","Joey","Johan"
                ,"Johann","John","Johnathan","Johnathon","Johnnie","Johnny","Jon","Jonah","Jonas","Jonathan"
                ,"Jonathon","Jonty","Jordan","Jordon","Jordy","Jorge","Jose","Joseph","Josh","Joshua"
                ,"Josiah","Joss","Josue","Jovan","Juan","Judah","Judas","Judd","Jude","Julian"
                ,"Julio","Julius","Justice","Justin","Kade","Kaden","Kai","Kaiden","Kaine","Kale"
                ,"Kaleb","Kameron","Kane","Karl","Karson","Karsten","Kash","Kasper","Kayden","Kayle"
                ,"Kaylen","Kayson","Kean","Keanu","Keaton","Kedrick","Keegan","Keenan","Keith","Kelby"
                ,"Kellan","Kellen","Kellin","Kelly","Kelvin","Ken","Kenan","Kendall","Kendrick","Kennedy"
                ,"Kenneth","Kenny","Kent","Kenton","Kerry","Kevin","Khalid","Khalil","Kian","Kiefer"
                ,"Kieran","Kieron","Killian","Kim","Kingsley","Kingston","Kip","Kiran","Kirby","Kirk"
                ,"Kit","Klaus","Klay","Knox","Kobe","Koby","Kody","Kolby","Konnor","Kris"
                ,"Krish","Kristian","Kristoff","Kristopher","Kurt","Kurtis","Kyan","Kye","Kylar","Kyle"
                ,"Kylen","Kyler","Kyran","Kyrin","Kyron","Lacey","Lachlan","Lake","Lamar","Lamont"
                ,"Lance","Lancelot","Landen","Landon","Landyn","Lane","Langdon","Langston","Larry","Lars"
                ,"Laurence","Laurie","Lawrence","Lawson","Layne","Layton","Leaf","Leandro","Lebron","Ledger"
                ,"Lee","Leif","Leigh","Leighton","Leland","Len","Lennie","Lennon","Lennox","Lenny"
                ,"Leo","Leon","Leonard","Leonardo","Leonel","Leopold","Leroy","Les","Leslie","Lester"
                ,"Leuan","Lev","Leven","Levi","Levy","Lewis","Lex","Leyton","Liam","Lief"
                ,"Lincoln","Linden","Lindon","Link","Linus","Lionel","Lisandro","Llewelyn","Lloyd","Lochlan"
                ,"Logan","Loki","London","Lonnie","Lorcan","Loren","Lorenzo","Loris","Lou","Louie"
                ,"Louis","Lowell","Luca","Lucas","Lucian","Luciano","Luigi","Luis","Lukas","Luke"
                ,"Luther","Lyle","Lyndon","Lynn","Lysander","Mack","Maddox","Magnus","Maison","Malachi"
                ,"Malakai","Malcolm","Malik","Malloy","Manny","Manuel","Marc","Marcel","Marcelo","Marco"
                ,"Marcos","Marcus","Marik","Mario","Marion","Mark","Marley","Marlon","Marquis","Marshall"
                ,"Martin","Marty","Martyn","Marvin","Mason","Massimo","Mat","Mateo","Mathew","Matt"
                ,"Matthew","Matthias","Maurice","Mauricio","Maverick","Max","Maxim","Maximilian","Maximus","Maxwell"
                ,"Mehdi","Mehtab","Mekhi","Mel","Melvin","Memphis","Merick","Mervin","Mervyn","Mica"
                ,"Micah","Michael","Micheal","Mick","Mickey","Miguel","Mike","Mikey","Milan","Miles"
                ,"Miller","Milo","Milton","Misha","Mitch","Mitchell","Mitt","Moe","Mohamed","Mohammad"
                ,"Mohammed","Moises","Monte","Montgomery","Monty","Mordecai","Morgan","Morris","Moses","Muhammad"
                ,"Murphy","Murray","Myles","Mylo","Myron","Nash","Nasir","Nate","Nath","Nathan"
                ,"Nathanael","Nathaniel","Neal","Ned","Neel","Nehemiah","Neil","Nelson","Nesbit","Nestor"
                ,"Neville","Nevin","Newton","Niall","Nicholas","Nick","Nickolas","Nicky","Nico","Nicolas"
                ,"Nigel","Nihal","Nik","Niklaus","Niko","Nikolai","Nikolas","Nile","Nils","Noah"
                ,"Noam","Noe","Noel","Nolan","Norbert","Norman","Norris","Norton","Nyle","Oakes"
                ,"Oakley","Oberon","Octavio","Oisin","Olaf","Oli","Oliver","Ollie","Olly","Omar"
                ,"Oran","Orion","Orlando","Orson","Oscar","Osvaldo","Oswald","Otis","Otto","Owain"
                ,"Owen","Ozzie","Ozzy","Pablo","Paco","Paddy","Padraig","Palmer","Paolo","Parker"
                ,"Pascal","Pat","Patrick","Paul","Paxton","Payton","Pearce","Pedro","Percy","Perry"
                ,"Petar","Pete","Peter","Peyton","Phebian","Phil","Philip","Philippe","Phillip","Phineas"
                ,"Phoenix","Pierce","Piers","Pip","Porter","Poul","Prakash","Preston","Prince","Princeton"
                ,"Quentin","Quincy","Quinlan","Quinn","Quinton","Quintrell","Rafael","Rafferty","Raheem","Rahul"
                ,"Raiden","Raj","Rajesh","Ralph","Ram","Rameel","Ramon","Ramsey","Randal","Randall"
                ,"Randolph","Randy","Raoul","Raphael","Rashad","Rashan","Rashid","Raul","Ravi","Ray"
                ,"Raylan","Raymond","Reece","Reed","Reef","Reese","Reg","Reggie","Reginald","Rehan"
                ,"Reid","Reilly","Remco","Remington","Remy","Ren","Rene","Reuben","Rex","Reynaldo"
                ,"Reza","Rhett","Rhydian","Rhys","Rian","Ricardo","Rich","Richard","Richie","Rick"
                ,"Rickey","Rickie","Ricky","Rico","Rider","Rigby","Rik","Riker","Riley","Rio"
                ,"Riordan","River","Roan","Rob","Robbie","Robby","Robert","Roberto","Robin","Rocco"
                ,"Rock","Rocky","Rod","Roddy","Roderick","Rodger","Rodney","Rodolfo","Rodrigo","Rogelio"
                ,"Roger","Rohan","Roland","Rolando","Roman","Romeo","Ron","Ronald","Ronan","Ronnie"
                ,"Ronny","Roosevelt","Rory","Roscoe","Ross","Rowan","Roy","Royce","Ruairi","Ruben"
                ,"Rubin","Rudolph","Rudy","Rufus","Rupert","Russ","Russell","Rusty","Ryan","Ryder"
                ,"Ryker","Rylan","Ryland","Ryle","Ryley","Sacha","Said","Salman","Salvador","Salvatore"
                ,"Sam","Samir","Sammy","Samson","Samuel","Sandeep","Sandy","Sanjay","Santiago","Sasha"
                ,"Saul","Sawyer","Scot","Scott","Scottie","Scotty","Seamus","Sean","Seb","Sebastian"
                ,"Sebastien","Sebestian","Sergio","Seth","Shadrach","Shane","Shannon","Shaun","Shawn","Shay"
                ,"Shayne","Shea","Sheldon","Shelton","Sherlock","Sherman","Sherwin","Shiloh","Sid","Sidney"
                ,"Silas","Simeon","Simon","Sky","Skylar","Skyler","Slade","Sol","Solomon","Sonny"
                ,"Soren","Spencer","Spike","Stacey","Stacy","Stan","Stanley","Stefan","Stephan","Stephen"
                ,"Sterling","Steve","Steven","Stevie","Stewart","Stone","Storm","Struan","Stuart","Sufyan"
                ,"Sullivan","Sven","Sylvester","Tadhg","Talon","Tam","Tane","Tanner","Tariq","Tarquin"
                ,"Tate","Taye","Taylor","Teague","Ted","Teddy","Teo","Terence","Terrance","Terrell"
                ,"Terrence","Terry","Tevin","Tex","Thad","Thaddeus","Theo","Theodore","Theon","Theophilus"
                ,"Thom","Thomas","Thor","Tiago","Tiberius","Tiernan","Tiger","Tim","Timmy","Timothy"
                ,"Tito","Titus","Tobias","Tobin","Toby","Tod","Todd","Tom","Tomas","Tommie"
                ,"Tommy","Tony","Torin","Toryn","Trace","Tracey","Tracy","Travis","Tray","Tremaine"
                ,"Trent","Trenton","Trevon","Trevor","Trey","Treyden","Tristan","Tristen","Triston","Troy"
                ,"Truman","Tucker","Turner","Ty","Tylan","Tyler","Tyrell","Tyren","Tyrese","Tyrone"
                ,"Tyson","Ulrich","Ulysses","Umar","Uriah","Uriel","Usama","Valentin","Valentine","Valentino"
                ,"Van","Vance","Vasco","Vaughn","Vernon","Vic","Victor","Vidal","Vihan","Vijay"
                ,"Vikram","Vince","Vincent","Vinnie","Virgil","Vishal","Vivian","Vlad","Vladimir","Wade"
                ,"Walker","Wallace","Wally","Walter","Warren","Waylon","Wayne","Wendell","Wes","Wesley"
                ,"Westin","Weston","Wilbert","Wilbur","Wiley","Wilfred","Wilhelm","Will","Willam","Willard"
                ,"Willem","William","Willie","Willis","Wilson","Winston","Wolf","Wolfgang","Woody","Wyatt"
                ,"Xander","Xavier","Xerxes","Yahir","Yardley","Yehudi","Yestin","York","Yuri","Yusuf"
                ,"Yves","Zac","Zach","Zachariah","Zachary","Zachery","Zack","Zackary","Zackery","Zaiden"
                ,"Zain","Zaine","Zak","Zander","Zane","Zayden","Zayn","Zayne","Zeb","Zebulon"
                ,"Zed","Zeke","Zeph","Ziggy","Zion","Zohar","Zoltan","Zuriel","Zylen"
        };

        mRecyclerView = (IndexableRecyclerView) findViewById(R.id.listview);
        RecyclerAdapter adapter = new RecyclerAdapter(datas);
        mRecyclerView.setAdapter(adapter);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
    }
    

    public class RecyclerAdapter extends RecyclerView.Adapter<ViewHolder>  implements SectionIndexer {

        private String mSections = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        public String[] datas = null;
        public RecyclerAdapter(String[] datas) {
            this.datas = datas;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item,viewGroup,false);
            ViewHolder vh = new ViewHolder(view);
            return vh;
        }

        @Override
        public void onBindViewHolder(ViewHolder viewHolder, int position) {
            viewHolder.mTextView.setText(datas[position]);
        }

        //获取数据的数量
        @Override
        public int getItemCount() {
            return datas.length;
        }

        @Override
        public int getPositionForSection(int section) {
            // If there is no item for current section, previous section will be selected
            for (int i = section; i >= 0; i--) {
                for (int j = 0; j < getItemCount(); j++) {
                    if (i == 0) {
                        // For numeric section
                        for (int k = 0; k <= 9; k++) {
                            if (StringMatcher.match(String.valueOf(datas[j].charAt(0)), String.valueOf(k)))
                                return j;
                        }
                    } else {
                        if (StringMatcher.match(String.valueOf(datas[j].charAt(0)), String.valueOf(mSections.charAt(i))))
                            return j;
                    }
                }
            }
            return 0;
        }

        @Override
        public int getSectionForPosition(int position) {
            return 0;
        }

        @Override
        public Object[] getSections() {
            String[] sections = new String[mSections.length()];
            for (int i = 0; i < mSections.length(); i++)
                sections[i] = String.valueOf(mSections.charAt(i));
            return sections;
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public ViewHolder(View view){
            super(view);
            mTextView = (TextView) view.findViewById(R.id.text);
        }
    }
}