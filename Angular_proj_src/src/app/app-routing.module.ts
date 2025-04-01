import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AnimeListComponent } from '../components/anime-list/anime-list.component';
import { AnimeDetailComponent } from '../components/anime-detail/anime-detail.component';
import { EnquiryFormComponent } from '../components/enquiry-form/enquiry-form.component';

const routes: Routes = [
  { path: '', component: AnimeListComponent },
  { path: 'anime/:id', component: AnimeDetailComponent },
  { path: 'enquiry', component: EnquiryFormComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
