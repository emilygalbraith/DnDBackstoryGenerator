package com.galbraithemily94.Klasses;

import com.galbraithemily94.Character;
import com.galbraithemily94.Klass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorcerer extends Klass {

    @Override
    public String toString() { return "Sorcerer"; }

    @Override
    public String getKlassStory(Character character) {
        List<String> klassStory = new ArrayList<>();
        String sorcerer1 = "";
        String sorcerer2 = "";
        klassStory.add(sorcerer1 + sorcerer2);
        Collections.shuffle(klassStory);
        return klassStory.get(0);
    }

//    Sorcerers carry a magical birthright conferred upon them by an exotic bloodline, some otherworldly influence, or
//    exposure to unknown cosmic forces. One can’t study sorcery as one learns a language, any more than one can learn to
//    live a legendary life. No one chooses sorcery; the power chooses the sorcerer.
//    Magic is a part of every sorcerer, suffusing body, mind, and spirit with a latent power that waits to be tapped.
//    Some sorcerers wield magic that springs from an ancient bloodline infused with the magic of dragons. Others carry
//    a raw, uncontrolled magic within them, a chaotic storm that manifests in unexpected ways.
//    The appearance of sorcerous powers is wildly unpredictable. Some draconic bloodlines produce exactly one sorcerer
//    in every generation, but in other lines of descent every individual is a sorcerer. Most of the time, the talents
//    of sorcery appear as apparent flukes. Some sorcerers can’t name the origin of their power, while others trace it
//    to strange events in their own lives. The touch of a demon, the blessing of a dryad at a baby’s birth, or a taste
//    of the water from a mysterious spring might spark the gift of sorcery. So too might the gift of a deity of magic,
//    exposure to the elemental forces of the Inner Planes or the maddening chaos of Limbo, or a glimpse into the inner
//    workings of reality.
//    Sorcerers have no use for the spellbooks and ancient tomes of magic lore that wizards rely on, nor do they rely
//    on a patron to grant their spells as warlocks do. By learning to harness and channel their own inborn magic, they
//    can discover new and staggering ways to unleash that power.

}
