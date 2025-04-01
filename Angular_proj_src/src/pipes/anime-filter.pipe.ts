import { Pipe, PipeTransform } from '@angular/core';
import { Anime } from '../model/anime';

@Pipe({
  name: 'animeFilter'
})
export class AnimeFilterPipe implements PipeTransform {
  transform(animeList: Anime[], searchText: string): Anime[] {
    if (!searchText) return animeList;
    return animeList.filter(anime => anime.genre.toLowerCase().includes(searchText.toLowerCase()));
  }
}
