import {Routes} from '@angular/router';
import {DashboardComponent} from '../../pages/dashboard/dashboard.component';

export const AdminLayoutRoutes: Routes = [
  {path: 'dashboard', component: DashboardComponent},
  {
    path: 'users',
    children: [
      {path: '', loadChildren: () => import('../../pages/users/users.module').then(m => m.UsersModule)},
    ]
  },
  {
    path: 'roles',
    children: [
      {path: '', loadChildren: () => import('../../pages/role/role.module').then(m => m.RoleModule)},
    ]
  },
  {
    path: 'permissions',
    children: [
      {path: '', loadChildren: () => import('../../pages/permission/permission.module').then(m => m.PermissionModule)},
    ]
  },
  {
    path: 'materials',
    children: [
      {path: '', loadChildren: () => import('../../pages/material/material.module').then(m => m.MaterialModule)},
    ]
  },
  {
    path: 'brands',
    children: [
      {path: '', loadChildren: () => import('../../pages/brand/brand.module').then(m => m.BrandModule)},
    ]
  }
];
