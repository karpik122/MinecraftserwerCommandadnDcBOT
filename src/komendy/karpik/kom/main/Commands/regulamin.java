package komendy.karpik.kom.main.Commands;

import komendy.Main;
import komendy.karpik.kom.main.Utilities.Utilities;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class regulamin implements CommandExecutor {
    private Main plugin;

    public regulamin(Main plugin) {
        this.plugin = plugin;
        plugin.getCommand("regulamin").setExecutor(this);
    }

    public boolean onCommand(CommandSender sender, Command cmd, String lab, String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Jedynie gracz może używać tej komendy");
            return true;
        } else {
            Player o;
            if (args.length == 0) {
                o = (Player)sender;
                o.sendMessage(ChatColor.DARK_GRAY + "-------------------[" + ChatColor.AQUA + ChatColor.BOLD + "Mine" + ChatColor.YELLOW + ChatColor.BOLD + "MedievalRP" + ChatColor.DARK_GRAY + "]---------------------");
                o.sendMessage("");
                o.sendMessage(Utilities.chat("&81 &a&lPodstawowe zasady"));
                o.sendMessage("");
                o.sendMessage(Utilities.chat("&81.1 &aMineMedievalRP to serwer RP."));
                o.sendMessage(Utilities.chat("&81.2 &aWejście na serwer minecraft jest równoznaczne z akceptacją regulaminu."));
                o.sendMessage(Utilities.chat("&81.3 &aNieznajomość regulaminu nie zwalnia z jego przestrzegania."));
                o.sendMessage(Utilities.chat("&81.4 &aZa bycie debilem, posiadanie ujemnego poziomu IQ lub masowego łamania regulaminu Adminstracja da wam bana!"));
                o.sendMessage(Utilities.chat("&81.5 &aNa serwerze obowiązuje kultura i szacunek dla innych osób (czyli zakazuje się np. Obrażania)."));
                o.sendMessage(Utilities.chat("&81.6 &aZakazuje się utrudniania pracy administracji."));
                o.sendMessage(Utilities.chat("&81.7 &aAdministracja ma prawo nałożyć permanentną sankcję na gracza."));
                o.sendMessage(Utilities.chat("&81.8 &aAdministracja nie ponosi odpowiedzialności za działania użytkowników."));
                o.sendMessage(Utilities.chat("&81.9 &aRegulamin jest własnością sieci GlobalUtopia. Zabrania się powielania go."));
                o.sendMessage(Utilities.chat("&81.10 &aZabrania się reklamowania czegokolwiek w jakikolwiek sposób."));
                o.sendMessage(Utilities.chat("&81.11 &aW przypadku znalezienia błędu serwera który można exploitować proszę o zgłoszenie do HeadAdmina lub wyżej (Osoba która jako pierwsza zgłosi się do HeadAdmina lub wyżej, otrzyma nagrodę odpowiadającą wielkości błędu)."));
                o.sendMessage(Utilities.chat("&81.12 &aAdministracja nie ponosi odpowiedzialności za stracenie przedmiotów (podczas łamania regulaminu lub błedów serwera)."));
                o.sendMessage(Utilities.chat("&81.13 &aAdministracja zastrzega sobie prawo do edycji regulaminu oraz karania graczy za czyny bliżej nie przytoczone w regulaminie."));
                o.sendMessage(Utilities.chat(""));
                o.sendMessage(Utilities.chat("&6Wpisz &8'&b/regulamin 2&8' &6aby przeczytać kolejną stronę."));
                o.sendMessage("");
                o.sendMessage(ChatColor.DARK_GRAY + "-----------------------------------------------------");
                return true;
            } else if (args.length == 1) {
                if (args[0].equalsIgnoreCase("1")) {
                    o = (Player)sender;
                    o.sendMessage(ChatColor.DARK_GRAY + "-------------------[" + ChatColor.AQUA + ChatColor.BOLD + "Mine" + ChatColor.YELLOW + ChatColor.BOLD + "MedievalRP" + ChatColor.DARK_GRAY + "]---------------------");
                    o.sendMessage("");
                    o.sendMessage(Utilities.chat("&a&lPodstawowe zasady"));
                    o.sendMessage("");
                    o.sendMessage(Utilities.chat("&81.1 &aMineMedievalRP to serwer RP."));
                    o.sendMessage(Utilities.chat("&81.2 &aWejście na serwer minecraft jest równoznaczne z akceptacją regulaminu."));
                    o.sendMessage(Utilities.chat("&81.3 &aNieznajomość regulaminu nie zwalnia z jego przestrzegania."));
                    o.sendMessage(Utilities.chat("&81.4 &aZa bycie debilem, posiadanie ujemnego poziomu IQ lub masowego łamania regulaminu Adminstracja da wam bana!"));
                    o.sendMessage(Utilities.chat("&81.5 &aNa serwerze obowiązuje kultura i szacunek dla innych osób (czyli zakazuje się np. Obrażania)."));
                    o.sendMessage(Utilities.chat("&81.6 &aZakazuje się utrudniania pracy administracji."));
                    o.sendMessage(Utilities.chat("&81.7 &aAdministracja ma prawo nałożyć permanentną sankcję na gracza."));
                    o.sendMessage(Utilities.chat("&81.8 &aAdministracja nie ponosi odpowiedzialności za działania użytkowników."));
                    o.sendMessage(Utilities.chat("&81.9 &aRegulamin jest własnością sieci MineMedievalRP. Zabrania się powielania go."));
                    o.sendMessage(Utilities.chat("&81.10 &aZabrania się reklamowania czegokolwiek w jakikolwiek sposób."));
                    o.sendMessage(Utilities.chat("&81.11 &aW przypadku znalezienia błędu serwera który można exploitować proszę o zgłoszenie do HeadAdmina lub wyżej (Osoba która jako pierwsza zgłosi się do HeadAdmina lub wyżej, otrzyma nagrodę odpowiadającą wielkości błędu)."));
                    o.sendMessage(Utilities.chat("&81.12 &aAdministracja nie ponosi odpowiedzialności za stracenie przedmiotów (podczas łamania regulaminu lub błedów serwera)."));
                    o.sendMessage(Utilities.chat("&81.13 &aAdministracja zastrzega sobie prawo do edycji regulaminu oraz karania graczy za czyny bliżej nie przytoczone w regulaminie."));
                    o.sendMessage(Utilities.chat(""));
                    o.sendMessage(Utilities.chat("&6Wpisz &8'&b/regulamin 2&8' &6aby przeczytać kolejną stronę."));
                    o.sendMessage("");
                    o.sendMessage(ChatColor.DARK_GRAY + "-----------------------------------------------------");
                    return true;
                } else if (args[0].equalsIgnoreCase("2")) {
                    o = (Player)sender;
                    o.sendMessage(ChatColor.DARK_GRAY + "-------------------[" + ChatColor.AQUA + ChatColor.BOLD + "Mine" + ChatColor.YELLOW + ChatColor.BOLD + "MedievalRP" + ChatColor.DARK_GRAY + "]---------------------");
                    o.sendMessage("");
                    o.sendMessage(Utilities.chat("&a&lZasady Minecraft"));
                    o.sendMessage("");
                    o.sendMessage(Utilities.chat("&82.1 &aZakazuje się używania wspomagaczy, cheatów i exploitów."));
                    o.sendMessage(Utilities.chat("&82.2 &aZakazuje się propagowania treści społecznie uznawanych za szkodliwe i nieodpowiednie."));
                    o.sendMessage(Utilities.chat("&82.3 &aZakazuje się spamu i floodu na chacie."));
                    o.sendMessage(Utilities.chat("&82.4 &aZakazuje się jakiegokolwiek działania na szkodę serwera (np. budowania maszyn lagujących)."));
                    o.sendMessage(Utilities.chat("&82.5 &aZakazuje się Griefingu, czyli celowego działania na szkodę krajobrazu."));
                    o.sendMessage(Utilities.chat("&82.6 &aZakazuje się tworzenia multikont oraz podszywania się pod innych graczy."));
                    o.sendMessage(Utilities.chat("&82.7 &aKażdy burmistrz ma obowiązek po założeniu miasta od razu stworzyć państwo lub dołączyć do już istniejącego (państwa będą darmowe)."));
                    o.sendMessage(Utilities.chat("&82.8 &aMamy miec gwiazdę na waszym pańtwowym serwerze Discord."));
                    o.sendMessage(Utilities.chat(""));
                    o.sendMessage(Utilities.chat("&6Wpisz &8'&b/regulamin 3&8' &6aby przeczytać kolejną stronę."));
                    o.sendMessage("");
                    o.sendMessage(ChatColor.DARK_GRAY + "-----------------------------------------------------");
                    return true;
                } else if (args[0].equalsIgnoreCase("3")) {
                    o = (Player)sender;
                    o.sendMessage(ChatColor.DARK_GRAY + "-------------------[" + ChatColor.AQUA + ChatColor.BOLD + "Mine" + ChatColor.YELLOW + ChatColor.BOLD + "MedievalRP" + ChatColor.DARK_GRAY + "]---------------------");
                    o.sendMessage("");
                    o.sendMessage(Utilities.chat("&a&lZasady RP"));
                    o.sendMessage("");
                    o.sendMessage(Utilities.chat("&83.1 &aZakazuje się zabijania i atakowania innych graczy bez wyraźnego powodu."));
                    o.sendMessage(Utilities.chat("&83.2 &aZakazuje się claim'owania terenów miasta w sposób, który nie jest w danej sytuacji wymagany, a utrudnia innym państwom ich rozwój."));
                    o.sendMessage(Utilities.chat("&83.3 &aW przypadku złamania prawa waszego kraju/miasta mozna wystawić list gończy na kanale 'Listy gończe'. (Będzie wtedy można danego gracza zabić, potrzeba jednak mieć dowód że zabiło się gracza z listu gończego). List gończy wygasa po zabiciu poszukiwanego."));
                    o.sendMessage(Utilities.chat("&83.4 &aZakazuje się budowania latających budowli, podziemnych farm oraz innych bardzo oddalonych od świata przedstawionego w fabule. (Możliwe są jedank wyjątki jeżeli przekona się Właściciela, że dana budowla spełnia wymogi RP)."));
                    o.sendMessage(Utilities.chat("&83.5 &aZakazuje się budowania afczarek."));
                    o.sendMessage(Utilities.chat("&83.6 &aZakazuje się 'Powergaming' np. zabudowywanie innych w cuboid'zie"));
                    o.sendMessage(Utilities.chat(""));
                    o.sendMessage(Utilities.chat("&6Wpisz &8'&b/regulamin 4&8' &6aby przeczytać kolejną stronę."));
                    o.sendMessage("");
                    o.sendMessage(ChatColor.DARK_GRAY + "-----------------------------------------------------");
                    return true;
                } else if (args[0].equalsIgnoreCase("4")) {
                    o = (Player)sender;
                    o.sendMessage(ChatColor.DARK_GRAY + "-------------------[" + ChatColor.AQUA + ChatColor.BOLD + "Mine" + ChatColor.YELLOW + ChatColor.BOLD + "MedievalRP" + ChatColor.DARK_GRAY + "]---------------------");
                    o.sendMessage("");
                    o.sendMessage(Utilities.chat("&a&lZasady wojen"));
                    o.sendMessage("");
                    o.sendMessage(Utilities.chat("&84.1 &aWojny to nie Bitwy."));
                    o.sendMessage(Utilities.chat("&84.2 &aW przypadku wypowiedzenia wojny bez powodu, strona atakująca musi wyznaczyć 20% swoich faktycznie aktywnych graczy, którzy dostaną na czas wojny bana, z czym muszą się udać do właściciela serwera lub HeadAdmina. (Ta sama zasada tyczy się wszystkich sojuszników agresora którzy wezmą udział w wojnie). "));
                    o.sendMessage(Utilities.chat("&84.3 &aWypowiedzenie wojny musi być uzasadnione. Możliwe uzasadnienia zostały wymienione poniżej, (O słuszności uzasadnienia decyduje własiciciel serwera lub HeadAdmin) na każde uzasadnienie należy posiadać dowód)."));
                    o.sendMessage(Utilities.chat("&84.3.1 &aRoszczenie terytorialne musi być uzasadnione np. historycznie (można żądać terenu spornego. Dany cel zdobywa się przez propagande)."));
                    o.sendMessage(Utilities.chat("&84.3.2 &aObraza przez władce liczy sie tylko jeżeli zrobi to sam władca lub oficjalny przedstawiciel państwa. (Nie można żądać w ramach rekompensaty terenów)."));
                    o.sendMessage(Utilities.chat("&84.3.3 &aIncydent dyplomatyczny np. zabójstwo bez powodu obywatela państwa, kradzieże, rozboje, itd. (Nie można żądać w ramach rekompensaty terenów)."));
                    o.sendMessage(Utilities.chat("&84.4 &aPo wygranej wojnie strona zwycięzców decyduje o warunkach pokoju pomiędzy państwami."));
                    o.sendMessage(Utilities.chat("&84.5 &aW przypadku negocjacji można poprosić osoby neutralne o bycie rozjemcą(czyli osobę trzecią np. Admina)."));
                    o.sendMessage(Utilities.chat(""));
                    o.sendMessage(Utilities.chat("&6Wpisz &8'&b/regulamin 5&8' &6aby przeczytać kolejną stronę."));
                    o.sendMessage("");
                    o.sendMessage(ChatColor.DARK_GRAY + "-----------------------------------------------------");
                    return true;
                } else if (args[0].equalsIgnoreCase("5")) {
                    o = (Player)sender;
                    o.sendMessage(ChatColor.DARK_GRAY + "-------------------[" + ChatColor.AQUA + ChatColor.BOLD + "Mine" + ChatColor.YELLOW + ChatColor.BOLD + "MedievalRP" + ChatColor.DARK_GRAY + "]---------------------");
                    o.sendMessage("");
                    o.sendMessage(Utilities.chat("&a&lBitwy"));
                    o.sendMessage("");
                    o.sendMessage(Utilities.chat("&85.1 &aPo wygranym oblężeniu zakazuje sie griefingu (np. niszczenia skrzyń, palenia przedmiotów i niszczenia budynków)."));
                    o.sendMessage(Utilities.chat("&85.2 &aZakazuje się niepotrzebnego griefingu ze strony atakujących podczas oblężenia."));
                    o.sendMessage(Utilities.chat("&85.3 &aPodczas oblężenia należy dać możliwość budowania atakującym."));
                    o.sendMessage(Utilities.chat("&85.4 &aZakazuje się zmiany permisji w mieście podczas wojny."));
                    o.sendMessage(Utilities.chat("&85.5 &aKażde oblężenie trwa dokładnie 24h obie strony muszą sie wtedy same zorganizować."));
                    o.sendMessage("");
                    o.sendMessage(ChatColor.DARK_GRAY + "-----------------------------------------------------");
                    return true;
                } else {
                    o = (Player)sender;
                    o.sendMessage(Utilities.chat("&8[&b&lMine&e&lMedievalRP&8] &cPoprawne użycie&8: &c/regulamin &8<&c1, 2, 3, 4 lub 5&8>"));
                    return true;
                }
            } else {
                return false;
            }
        }
    }
}
