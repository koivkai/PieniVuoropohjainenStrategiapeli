package peli.logic;

public class Duel {

    private Map map;
    private Player player1;
    private Player player2;
    private Unit selectedUnit;
    private Tile selectedTile;
    private Building selectedBuilding;
    private BuildingList buildings;
    private Player playerWhoseTurnItIs;
    private Player winner;

    // tÃƒÂ¤mÃƒÂ¤ on alkuun ainoa kartta
    public Duel(Player player1, Player playder2) {
        this.map = new Map(20, 20);
        this.player1 = player1;
        this.player2 = playder2;
        this.selectedTile = null;
        this.selectedUnit = null;
        this.buildings = new BuildingList();
        this.playerWhoseTurnItIs = player1;
        this.winner = null;

    }

    public void buildMap() {

        String mapAsString = "ppppppfmfppqmqpfffffpqppppfmfppafappqmqppmzmqpfmfppprppppppppa1pppfmfppz1zppapappp32222222224pfppppppp1ppppppppp1pffffpmpf1ppfffffpp322225pmpf1apfqmqf627pppf1pmpf1ppfffff1pppppf1pmpp1ppppppq1pfffff1pmmp1fffffp1qpppppp1ppmp1fppppp1fffffpp1fpmp1fppp627fqmqfpa1fpmp822224ppfffffpp1fpmpffffp1ppppppppp1pppppppfp32222222224pppapappz1zppfmfppp1appppppppbpppfmfpqmzmppqmqppafappfmfppppqpfffffpqmqppfmfpppppp";

        int x = 1;
        int y = 1;
        for (int i = 0; i < mapAsString.length(); i++) {
            if (x == 21) {
                y++;
                x = 1;
            }
            char tileTypeID = mapAsString.charAt(i);
            TileType typeToBe = null;

            if (tileTypeID == 'p') {
                typeToBe = TileType.PLAINS;
            }
            if (tileTypeID == 'f') {
                typeToBe = TileType.FOREST;
            }
            if (tileTypeID == 'm') {
                typeToBe = TileType.MOUNTAINS;
            }
            if (tileTypeID == 'q') {
                typeToBe = TileType.MINENEUTRAL;
            }
            if (tileTypeID == 'a') {
                typeToBe = TileType.FARMNEUTRAL;
            }
            if (tileTypeID == 'z') {
                typeToBe = TileType.OUTPOSTNEUTRAL;
            }
            if (tileTypeID == 'r') {
                typeToBe = TileType.REDHQ;
            }
            if (tileTypeID == '1') {
                typeToBe = TileType.ROADVERTICAL;
            }
            if (tileTypeID == '2') {
                typeToBe = TileType.ROADHORIZONTAL;
            }
            if (tileTypeID == '3') {
                typeToBe = TileType.ROADUPRIGHTDOWN;
            }
            if (tileTypeID == '4') {
                typeToBe = TileType.ROADUPLEFTDOWN;
            }
            if (tileTypeID == '5') {
                typeToBe = TileType.ROADDOWNTOLEFT;
            }
            if (tileTypeID == '6') {
                typeToBe = TileType.ROADDOWNTORIGHT;
            }
            if (tileTypeID == '7') {
                typeToBe = TileType.ROADUPTOLEFT;
            }
            if (tileTypeID == '8') {
                typeToBe = TileType.ROADUPTORIGHT;
            }
            if (tileTypeID == 'b') {
                typeToBe = TileType.BLUEHQ;
            }

            Tile tile = new Tile(x, y, typeToBe);
            this.map.addTile(tile);
            x++;
        }
    }

    public void placeBuildings() {

        Building building1 = new Building("Mine", player2, map.getTiles().get(11));
        this.buildings.addBuilding(building1);

        Building building2 = new Building("Mine", player2, map.getTiles().get(13));
        this.buildings.addBuilding(building2);

        Building building3 = new Building("Mine", null, map.getTiles().get(21));
        this.buildings.addBuilding(building3);

        Building building4 = new Building("Farm", player2, map.getTiles().get(31));
        this.buildings.addBuilding(building4);

        Building building5 = new Building("Farm", player2, map.getTiles().get(33));
        this.buildings.addBuilding(building5);

        Building building6 = new Building("Farm", null, map.getTiles().get(36));
        this.buildings.addBuilding(building6);

        Building building7 = new Building("Farm", null, map.getTiles().get(38));
        this.buildings.addBuilding(building7);

        Building building8 = new Building("Outpost", null, map.getTiles().get(42));
        this.buildings.addBuilding(building8);

        Building building9 = new Building("Mine", null, map.getTiles().get(44));
        this.buildings.addBuilding(building9);

        Building building10 = new Building("HQ", player2, map.getTiles().get(52));
        this.buildings.addBuilding(building10);

        Building building11 = new Building("Farm", null, map.getTiles().get(61));
        this.buildings.addBuilding(building11);

        Building building12 = new Building("Outpost", player2, map.getTiles().get(71));
        this.buildings.addBuilding(building12);

        Building building13 = new Building("Outpost", player2, map.getTiles().get(73));
        this.buildings.addBuilding(building13);

        Building building14 = new Building("Farm", null, map.getTiles().get(76));
        this.buildings.addBuilding(building14);

        Building building15 = new Building("Farm", null, map.getTiles().get(78));
        this.buildings.addBuilding(building15);

        Building building16 = new Building("Farm", null, map.getTiles().get(143));
        this.buildings.addBuilding(building16);

        Building building17 = new Building("Mine", player2, map.getTiles().get(189));
        this.buildings.addBuilding(building17);

        Building building18 = new Building("Mine", player1, map.getTiles().get(210));
        this.buildings.addBuilding(building18);

        Building building19 = new Building("Mine", null, map.getTiles().get(146));
        this.buildings.addBuilding(building19);

        Building building20 = new Building("Mine", null, map.getTiles().get(148));
        this.buildings.addBuilding(building20);

        Building building21 = new Building("Mine", null, map.getTiles().get(251));
        this.buildings.addBuilding(building21);

        Building building22 = new Building("Mine", null, map.getTiles().get(253));
        this.buildings.addBuilding(building22);

        Building building23 = new Building("Farm", null, map.getTiles().get(256));
        this.buildings.addBuilding(building23);

        Building building24 = new Building("Farm", null, map.getTiles().get(321));
        this.buildings.addBuilding(building24);

        Building building25 = new Building("Farm", null, map.getTiles().get(323));
        this.buildings.addBuilding(building25);

        Building building26 = new Building("Outpost", player1, map.getTiles().get(326));
        this.buildings.addBuilding(building26);

        Building building27 = new Building("Outpost", player1, map.getTiles().get(328));
        this.buildings.addBuilding(building27);

        Building building28 = new Building("Farm", null, map.getTiles().get(333));
        this.buildings.addBuilding(building28);

        Building building29 = new Building("HQ", player1, map.getTiles().get(347));
        this.buildings.addBuilding(building29);

        Building building30 = new Building("Mine", null, map.getTiles().get(355));
        this.buildings.addBuilding(building30);

        Building building31 = new Building("Outpost", null, map.getTiles().get(357));
        this.buildings.addBuilding(building31);

        Building building32 = new Building("Mine", null, map.getTiles().get(361));
        this.buildings.addBuilding(building32);

        Building building33 = new Building("Mine", null, map.getTiles().get(363));
        this.buildings.addBuilding(building33);

        Building building34 = new Building("Farm", player1, map.getTiles().get(366));
        this.buildings.addBuilding(building34);

        Building building35 = new Building("Farm", player1, map.getTiles().get(368));
        this.buildings.addBuilding(building35);

        Building building36 = new Building("Mine", null, map.getTiles().get(378));
        this.buildings.addBuilding(building36);

        Building building37 = new Building("Mine", player1, map.getTiles().get(386));
        this.buildings.addBuilding(building37);

        Building building38 = new Building("Mine", player1, map.getTiles().get(388));
        this.buildings.addBuilding(building38);
    }

    public void placeStartingUnits() {
        Unit unit = new Unit(3, 0.2, 15.0, 20.0, this.getMap().getTiles().get(306), "Spearman", this.player1);
        Unit unit2 = new Unit(3, 0.2, 15.0, 20.0, this.getMap().getTiles().get(308), "Spearman", this.player1);
        Unit unit3 = new Unit(3, 0.2, 15.0, 20.0, this.getMap().getTiles().get(91), "Spearman", this.player2);
        Unit unit4 = new Unit(3, 0.2, 15.0, 20.0, this.getMap().getTiles().get(93), "Spearman", this.player2);

        this.player1.addUnit(unit);
        this.player1.addUnit(unit2);
        this.player2.addUnit(unit3);
        this.player2.addUnit(unit4);
    }

    public void setUpScenario() {
        buildMap();
        placeBuildings();
        placeStartingUnits();
    }

    public Map getMap() {
        return map;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setSelectedTile(Tile selectedTile) {
        this.selectedTile = selectedTile;
    }

    public void setSelectedUnit(Unit selectedUnit) {
        this.selectedUnit = selectedUnit;
    }

    public Tile getSelectedTile() {
        return selectedTile;
    }

    public Unit getSelectedUnit() {
        return selectedUnit;
    }

    public BuildingList getBuildings() {
        return buildings;
    }

    public Building getSelectedBuilding() {
        return selectedBuilding;
    }

    public void setSelectedBuilding(Building selectedBuilding) {
        this.selectedBuilding = selectedBuilding;
    }

    public Player getPlayerWhoseTurnItIs() {
        return playerWhoseTurnItIs;
    }

    public void setPlayerWhoseTurnItIs(Player playerWhoseTurnItIs) {
        this.playerWhoseTurnItIs = playerWhoseTurnItIs;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public Player getWinner() {
        return winner;
    }

}
