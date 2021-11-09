package com.galbraithemily94.Klasses;

import com.galbraithemily94.Character;
import com.galbraithemily94.Klass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Druid extends Klass {

    @Override
    public String toString() { return "Druid"; }

    @Override
    public String getKlassStory(Character character) {
        List<String> klassStory = new ArrayList<>();
        String druid1 = "";
        String druid2 = "";
        klassStory.add(druid1 + druid2);
        Collections.shuffle(klassStory);
        return klassStory.get(0);
    }

//    Whether calling on the elemental forces of nature or emulating the creatures of the animal world, druids are an
//    embodiment of nature’s resilience, cunning, and fury. They claim no mastery over nature. Instead, they see themselves
//    as extensions of nature’s indomitable will.
//    Druids revere nature above all, gaining their spells and other magical powers either from the force of nature itself
//    or from a nature deity. Many druids pursue a mystic spirituality of transcendent union with nature rather than devotion
//    to a divine entity, while others serve gods of wild nature, animals, or elemental forces. The ancient druidic traditions
//    are sometimes called the Old Faith, in contrast to the worship of gods in temples and shrines.
//    Druid spells are oriented toward nature and animals—the power of tooth and claw, of sun and moon, of fire and storm.
//    Druids also gain the ability to take on animal forms, and some druids make a particular study of this practice, even
//    to the point where they prefer animal form to their natural form.
}
